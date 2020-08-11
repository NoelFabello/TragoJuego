/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesJosito;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Josito extends Personaje {

  public Josito() {
    super(
        "Josito",
        "",
        true,
        430,
        80,
        110,
        100,
        100,
        new SetAtaquesJosito(),
        "",
        "");
  }
}
