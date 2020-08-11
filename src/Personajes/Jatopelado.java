/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesJatopelado;
import Nucleo.Ataque;
import Nucleo.Objeto;
import Objetos.*;
import Nucleo.Personaje;

import java.util.ArrayList;

/** @author Noel */
public class Jatopelado extends Personaje {

  public Jatopelado() {
    super(
        "Jatopelado",
        "",
        true,
        470,
        60,
        110,
        100,
        70,
        new SetAtaquesJatopelado(),
        "",
        "");
  }

  @Override
  public Boolean usarObjeto(Objeto objeto, Personaje rival) {
    if (objeto instanceof Apuntes) {
      SetAtaquesJatopelado.get(0).setDaño(SetAtaquesJatopelado.get(0).getDaño());
    }
    return super.usarObjeto(objeto, rival);
  }
}
