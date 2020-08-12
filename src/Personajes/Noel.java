/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Ataques.SetAtaquesNoel;
import Nucleo.Ataque;
import Nucleo.Estados;
import Nucleo.Objeto;
import Objetos.Ak47;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Screenshot;
import Objetos.Vodka;
import Objetos.Vómito;

import java.util.ArrayList;
import java.util.List;
import Nucleo.Personaje;

/** @author Noel */
public class Noel extends Personaje {

  public Noel() {
    super(
        "Noel",
        "",
        true,
        400,
        115,
        80,
        100,
        85,
        new SetAtaquesNoel(),
        "Fotos/Cercanas/noel.png",
        "Fotos/Lejanas/noel.png");
  }

  @Override
  public Boolean usarObjeto(Objeto objeto, Personaje rival) {
    if (objeto instanceof Ak47) {
      if (super.usarObjeto(objeto, rival)) {
        return true;
      } else {
        setEstadosBase(Estados.TILTEADO);
        return false;
      }
    } else {
      return super.usarObjeto(objeto, rival);
    }
  }
}
