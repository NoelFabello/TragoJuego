/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nucleo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Noel
 */
public class Jugador {
    private String nombre;
    private ArrayList<Personaje> equipo;
    private Personaje activo;
    private ArrayList<Objeto> objetos;
    private boolean decisionTomada;
    private Decision decision;
    private int dinero;
    
    public Jugador(String nombre, ArrayList<Personaje> equipo, ArrayList<Objeto> objetos) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.activo = null;
        this.objetos = objetos;
        this.decisionTomada = false;
        this.decision = new Decision();
        this.dinero = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Personaje> getEquipo() {
        return equipo;
    }

    public Personaje getActivo() {
        return activo;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(ArrayList<Personaje> equipo) {
        this.equipo = equipo;
    }

    public void setActivo(Personaje activo) {
        this.activo = activo;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    public boolean isDecisionTomada() {
        return decisionTomada;
    }

    public void setDecisionTomada(boolean decisionTomada) {
        this.decisionTomada = decisionTomada;
    }

    public Decision getDecision() {
        return decision;
    }

    public int getDinero() {
        return dinero;
    }
    
    public String getDineroString(){
        StringBuilder toret = new StringBuilder();
        toret.append(dinero);
        return toret.toString();
    }
    
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public void decisionesFalse(){
        this.getDecision().setAtacar(false);
        this.getDecision().setUsarObjeto(false);
        this.getDecision().setCambiar(false);
    }
    
    public void elegirInicial(int personaje){
        activo = equipo.get(personaje);
        equipo.remove(personaje);
    }
    
    public void cambiarActivo(int personaje){
        equipo.add(activo);
        activo= equipo.get(personaje);
        equipo.remove(personaje);
    }
    
    public void ActivarObjeto(int objeto, Personaje rival){
        activo.usarObjeto(objetos.get(objeto),rival);
    }    
    
    public void Atacar(){
        activo.atacarHabilidad(0, activo);
    }

    
            
}
