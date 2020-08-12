/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesAdri;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Adri extends Personaje {
  public Adri() {
    super(
        "Adri",
        "",
        true,
        400,
        120,
        70,
        100,
        70,
        new SetAtaquesAdri(),
        "",
        "");
  }
}
