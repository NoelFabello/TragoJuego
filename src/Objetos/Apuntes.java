/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Nucleo.Estados;
import Personajes.Javier;
import Nucleo.Objeto;
import Nucleo.Personaje;
/** @author Noel */
public class Apuntes extends Objeto {
  public Apuntes() {
    super(
        "Apuntes", "", false, 0, +20, 0, +10, 0, 100, 10, 0, 0, 0, 0, Estados.ESTRESADO, null, "");
  }
}
