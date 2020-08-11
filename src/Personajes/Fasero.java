/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesFasero;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Fasero extends Personaje {
  public Fasero() {
    super(
        "Fasero",
        "",
        true,
        330,
        140,
        60,
        100,
        90,
        new SetAtaquesFasero(),
        "",
        "");
  }
}
