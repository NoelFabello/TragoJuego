/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Nucleo.Ataque;
import

        Objetos.Ak47;
import Objetos.Capacho;
import Objetos.Porro;
import Objetos.Screenshot;
import Objetos.Vodka;
import Objetos.Vómito;

import java.util.ArrayList;
import java.util.List;
import Nucleo.Personaje;

/**
 *
 * @author Noel
 */
public class Noel extends Personaje{

    public Noel(String nombre, String descripcion, boolean sexo, int vida, int ataque, int armadura, int precision, int velocidad, int bonificador, ArrayList<Ataque> ataques) {
        super("Noel", "", true, vida, ataque, armadura, precision, velocidad, bonificador, ataques,"","");
    }
}

