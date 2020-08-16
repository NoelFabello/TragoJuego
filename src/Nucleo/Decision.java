/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nucleo;

/**
 *
 * @author saul
 */
public class Decision {
    private boolean atacar;
    private boolean cambiar;
    private boolean usarObjeto;
    private int ataque;
    private int cambio;
    private int objeto;

    public Decision() {
        this.atacar = false;
        this.cambiar = false;
        this.ataque = 0;
        this.cambio = 0;
    }

    public boolean isAtacar() {
        return atacar;
    }

    public void setAtacar(boolean atacar) {
        this.atacar = atacar;
    }

    public boolean isCambiar() {
        return cambiar;
    }

    public void setCambiar(boolean cambiar) {
        this.cambiar = cambiar;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public boolean isUsarObjeto() {
        return usarObjeto;
    }

    public void setUsarObjeto(boolean usarObjeto) {
        this.usarObjeto = usarObjeto;
    }

    public int getObjeto() {
        return objeto;
    }

    public void setObjeto(int objeto) {
        this.objeto = objeto;
    }
}
