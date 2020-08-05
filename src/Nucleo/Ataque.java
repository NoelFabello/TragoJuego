/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nucleo;

import javax.swing.*;

/**
 *
 * @author Noel
 */
public class Ataque {
    private String nombre;
    private String descripcion;
    private int daño;
    private int precision;
    private int PrecisionModStats;
    private int modVida;
    private int modAtaque;
    private int modAtaqueRival;
    private int modArmadura;
    private int modArmaduraRival;
    private int modPrecision;
    private int modPrecisionRival;
    private int modVelocidad;
    private int modVelocidadRival;
    private Estados EstadoEnemigo;
    private Estados EstadoPropio;

    public Ataque(String nombre, String descripcion, int daño, int precision, int precisionModStats, int modVida, int modAtaque, int modAtaqueRival, int modArmadura, int modArmaduraRival, int modPrecision, int modPrecisionRival, int modVelocidad, int modVelocidadRival, Estados estadoEnemigo, Estados estadoPropio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.daño = daño;
        this.precision = precision;
        PrecisionModStats = precisionModStats;
        this.modVida = modVida;
        this.modAtaque = modAtaque;
        this.modAtaqueRival = modAtaqueRival;
        this.modArmadura = modArmadura;
        this.modArmaduraRival = modArmaduraRival;
        this.modPrecision = modPrecision;
        this.modPrecisionRival = modPrecisionRival;
        this.modVelocidad = modVelocidad;
        this.modVelocidadRival = modVelocidadRival;
        EstadoEnemigo = estadoEnemigo;
        EstadoPropio = estadoPropio;
    }

    public int getModVelocidadRival() {
        return modVelocidadRival;
    }

    public Estados getEstadoPropio() {
        return EstadoPropio;
    }

    public void setEstadoPropio(Estados estadoPropio) {
        EstadoPropio = estadoPropio;
    }

    public void setModVelocidadRival(int modVelocidadRival) {
        this.modVelocidadRival = modVelocidadRival;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getPrecisionModStats() {
        return PrecisionModStats;
    }

    public void setPrecisionModStats(int PrecisionModStats) {
        this.PrecisionModStats = PrecisionModStats;
    }

    public int getModVida() {
        return modVida;
    }

    public void setModVida(int modVida) {
        this.modVida = modVida;
    }

    public int getModAtaque() {
        return modAtaque;
    }

    public void setModAtaque(int modAtaque) {
        this.modAtaque = modAtaque;
    }

    public int getModAtaqueRival() {
        return modAtaqueRival;
    }

    public void setModAtaqueRival(int modAtaqueRival) {
        this.modAtaqueRival = modAtaqueRival;
    }

    public int getModArmadura() {
        return modArmadura;
    }

    public void setModArmadura(int modArmadura) {
        this.modArmadura = modArmadura;
    }

    public int getModArmaduraRival() {
        return modArmaduraRival;
    }

    public void setModArmaduraRival(int modArmaduraRival) {
        this.modArmaduraRival = modArmaduraRival;
    }

    public int getModPrecision() {
        return modPrecision;
    }

    public void setModPrecision(int modPrecision) {
        this.modPrecision = modPrecision;
    }

    public int getModPrecisionRival() {
        return modPrecisionRival;
    }

    public void setModPrecisionRival(int modPrecisionRival) {
        this.modPrecisionRival = modPrecisionRival;
    }

    public int getModVelocidad() {
        return modVelocidad;
    }

    public void setModVelocidad(int modVelocidad) {
        this.modVelocidad = modVelocidad;
    }

    public Estados getEstadoEnemigo() {
        return EstadoEnemigo;
    }

    public void setEstadoEnemigo(Estados EstadoEnemigo) {
        this.EstadoEnemigo = EstadoEnemigo;
    }

    
    
    
    
    
    
    
    
}
