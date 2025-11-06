/*

Copyright 2325 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.e03;


/** Classe per la verifica dell'uguaglianza tra frazioni. */
public class UguaglianzaFrazioni {
  /** Costruttore privato per impedire l'istanziazione. */
  private UguaglianzaFrazioni() {}

<<<<<<< HEAD
  public static void main(String[] args) {

    if (args.length != 4) {
        System.out.println("necessari argomenti da riga di comando: java UguaglianzaFrazioni num1 den1 num2 den2");
        return;
    }

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);

    if(a*d==b*c){
      System.out.println("uguali");
    } else {
      System.out.println("diversi");
    }
   }





  





  /**
=======
  /*
>>>>>>> 371fbdbd7f9efabbe837da31a9673f130ea80312
   * Scrivere il metodo main che riceva come parametri sulla linea di comando quattro interi
   * corrispondenti rispettivamente a numeratore e denominatore di due frazioni ed emetta nel flusso
   * d'uscita "uguali" se le frazioni sono uguali, oppure "diverse".
   */
}
