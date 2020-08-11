/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ilc;

import Nucleo.Jugador;
import Nucleo.Personaje;
import Personajes.Miranda;
import Personajes.Noel;
import Personajes.Sulo;
import java.util.ArrayList;

/**
 *
 * @author saul
 */
public class Control {
    public static void Inicio(){Personaje noel = new Noel();
        Sulo sulo = new Sulo(); 
        Miranda miranda = new Miranda();
        Noel noel2 = new Noel();
        Sulo sulo2 = new Sulo(); 
        Miranda miranda2 = new Miranda();
        ArrayList<Personaje> e1 = new ArrayList<>();
        ArrayList<Personaje> e2 = new ArrayList<>();
        e1.add(noel);
        e1.add(sulo);
        e1.add(miranda);
        e1.add(noel2);
        e1.add(sulo2);
        e1.add(miranda2);
        Jugador jugador1 = new Jugador("J1",e1,null);
        Jugador jugador2 = new Jugador("J2",e2,null);
        PartidaPrincipal p = new PartidaPrincipal(jugador1, jugador2);
    }
}
