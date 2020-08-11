/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesSulo;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Sulo extends Personaje {
  public Sulo() {
    super(
        "Sulo",
        "",
        true,
         400,
        105,
        100,
        100,
        90,
        new SetAtaquesSulo(),
        "Fotos/Cercanas/sulo.png",
        "Fotos/Lejanas/sulo.png");
  }
}
