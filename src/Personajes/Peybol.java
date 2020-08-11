/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesPeybol;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Peybol extends Personaje {
  public Peybol() {
    super(
        "Peybol",
        "",
        true,
        380,
        120,
        80,
        90,
        95,
        new SetAtaquesPeybol(),
        "",
        "");
  }
}
