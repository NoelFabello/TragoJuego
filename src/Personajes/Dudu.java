/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Nucleo.Ataque;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Vodka;
import Objetos.Vómito;
import Nucleo.Personaje;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Dudu extends Personaje{
    public Dudu(String nombre, String descripcion, boolean sexo, int vida, int ataque, int armadura, int precision, int velocidad, int bonificador, ArrayList<Ataque> ataques) {
        super("Dudu", "", true, vida, ataque, armadura, precision, velocidad, ataques,"","");
    }
}
