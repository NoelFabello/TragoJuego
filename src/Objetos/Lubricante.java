/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Nucleo.Estados;
import Nucleo.Objeto;
import Nucleo.Personaje;
/** @author Noel */
public class Lubricante extends Objeto {

  public Lubricante() {
    super(
        "Lubricante",
        "",
        false,
        0,
        +20,
        0,
        0,
        -20,
        90,
        0,
        0,
        +20,
        0,
        0,
        Estados.CACHONDO,
         Estados.MOJADA,
         "");
  }
}
