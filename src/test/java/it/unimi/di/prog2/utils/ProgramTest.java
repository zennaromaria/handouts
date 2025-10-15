package it.unimi.di.prog2.utils;

import java.io.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public abstract class ProgramTest {
    public abstract String getMainClassName();

    @Test   //   è fondamentale!
    void runProgram() throws Exception {
        String testDir = "tests/" + getMainClassName().replace('.', '/') + "/";
        File dir = new File(testDir);
        File[] inputs = dir.listFiles((d, name) -> name.startsWith("input-"));
        if (inputs == null) return;

        for (File input : inputs) {
            String n = input.getName().replace("input-", "").replace(".txt", "");
            File expected = new File(testDir + "expected-" + n + ".txt");
            File actual = new File(testDir + "actual-" + n + ".txt");

            Process p = new ProcessBuilder("java", "-cp", "bin/main", getMainClassName())
                .redirectInput(input)
                .redirectOutput(actual)
                .start();
            p.waitFor();

            if (System.getenv("GENERATE_ACTUAL_FILES") == null) {
                Assertions.assertTrue(expected.exists(), "Missing expected-" + n + ".txt");
                try (BufferedReader e = new BufferedReader(new FileReader(expected));
                     BufferedReader a = new BufferedReader(new FileReader(actual))) {
                    String el, al;
                    while ((el = e.readLine()) != null | (al = a.readLine()) != null) {
                        Assertions.assertEquals(el, al, "Mismatch in test " + n);
                    }
                }
            }
        }
    }
}
