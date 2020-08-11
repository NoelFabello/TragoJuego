/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Nucleo.Estados;
import Personajes.Adri;
import Personajes.Javier;
import Personajes.Peybol;
import Personajes.Noel;
import Personajes.Sulo;
import Nucleo.Objeto;
import Nucleo.Personaje;
/** @author Noel */
public class Porro extends Objeto {
  public Porro() {
    super(
        "Porro", "", false, 0, +20, 0, 0, 0, 90, -10, 0, 0, 0, 0, Estados.EMPORRADO, null, "" + "");
  }
}
