/*package it.unimi.di.prog2.e03; //VERSIONE CHE NON RESTIUISCE

import org.junit.jupiter.api.Test;

public class SommaCentesimiTest {
  @Test
  void runSommaCentesimi() throws Exception {
    SommaCentesimi.main(new String[0]);
  }
}
*/
package it.unimi.di.prog2.e03;

import it.unimi.di.prog2.utils.ProgramTest;

public class SommaCentesimiTest extends ProgramTest {
    @Override
    public String getMainClassName() {
        return "it.unimi.di.prog2.e03.SommaCentesimi";
    }
}
