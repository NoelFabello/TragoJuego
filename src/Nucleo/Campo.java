/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nucleo;

/**
 *
 * @author Noel
 */
public class Campo {
    private int turno;
    private Jugador Cercano;
    private Jugador Lejano;

    public Campo(Jugador Cercano, Jugador  Lejano) {
        this.turno = 0;
        this.Cercano = Cercano;
        this.Lejano = Lejano;
    }

    private void pasarTurno(){
        turno++;
    }
    private void comprobarVictoria(){}
    private void cambiarActivo(){}
}
