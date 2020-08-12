/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesDudu;
import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Dudu extends Personaje {
  public Dudu() {
    super("Dudu", "", true, 440, 100, 50, 100, 75, new SetAtaquesDudu(), "", "");
  }
}
