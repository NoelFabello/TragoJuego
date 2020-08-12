/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesEsteban;
import Ataques.SetAtaquesFasero;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Esteban extends Personaje {
  public Esteban() {
    super("Esteban", "", true, 430, 75, 100, 100, 75, new SetAtaquesEsteban(), "", "");
  }
}
