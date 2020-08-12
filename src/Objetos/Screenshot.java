/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Nucleo.Estados;
import Personajes.Noel;
import Nucleo.Objeto;
import Nucleo.Personaje;

/** @author Noel */

public class Screenshot extends Objeto {
  public Screenshot(Noel personaje) {
    super(
            "Screenshot",
            "",
            false,
            140,
            +10,
            0,
            0,
            -20,
            100,
            0,
            0,
            0,
            0,
            0,
            Estados.CACHONDO,
            Estados.MOJADA,
            "");
  }

  public Screenshot(Personaje personaje) {
    super(
        "Screenshot",
        "",
        false,
        120,
        +10,
        0,
        0,
        -20,
        60,
        0,
        0,
        0,
        0,
        0,
        Estados.CACHONDO,
        Estados.MOJADA,
        "");
  }

}
