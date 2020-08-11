/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesJavier;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Javier extends Personaje {

  public Javier() {
    super(
        "Javier",
        "",
        true,
        350,
        130,
        70,
        100,
        100,
        new SetAtaquesJavier(),
        "",
        "");
  }
}
