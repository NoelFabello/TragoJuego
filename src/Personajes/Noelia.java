/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesNoelia;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Noelia extends Personaje {
  public Noelia() {
    super(
        "Noelia",
        "",
        false,
        370,
        130,
        75,
        100,
        95,
        new SetAtaquesNoelia(),
        "",
        "");
  }
}
