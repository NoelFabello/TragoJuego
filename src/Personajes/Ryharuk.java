/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesRyharuk;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Ryharuk extends Personaje {
  public Ryharuk(
      String nombre,
      String descripcion,
      boolean sexo,
      int vida,
      int ataque,
      int armadura,
      int precision,
      int velocidad,
      ArrayList<Ataque> ataques) {
    super(
        "Ryharuk",
        "",
        true,
        430,
        90,
        90,
        100,
        90,
        new SetAtaquesRyharuk(),
        "",
        "");
  }
}
