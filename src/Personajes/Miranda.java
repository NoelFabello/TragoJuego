/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesMiranda;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Miranda extends Personaje {

  public Miranda() {
    super(
        "Miranda",
        "",
        false,
        450,
        70,
        130,
        100,
        70,
        new SetAtaquesMiranda(),
        "Fotos/Cercanas/miranda.png",
        "Fotos/Lejanas/miranda.png");
  }
}
