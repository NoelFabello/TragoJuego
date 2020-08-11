/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesMisswey;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Misswey extends Personaje {

  public Misswey() {
    super(
        "Misswey",
        "",
        false,
        420,
        80,
        120,
        100,
        100,
        new SetAtaquesMisswey(),
        "",
        "");
  }
}
