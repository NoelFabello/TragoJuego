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
public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private boolean sexo;
    private int vidaTotal;
    private int vidaActual;
    private int ataque;
    private int armadura;
    private int precision;
    private int velocidad;
    private int bonificador;
    private Estados estadosBase;
    private Estados estadosAlcohol;
    private Estados estadosSexuales;
    private ArrayList<Ataque> ataques;

    public Personaje(String nombre, String descripcion, boolean sexo, int vida, int ataque, int armadura, int precision, int velocidad, int bonificador, ArrayList<Ataque> ataques) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.vidaTotal = vida;
        this.vidaActual = vidaTotal;
        this.ataque = ataque;
        this.armadura = armadura;
        this.precision = precision;
        this.velocidad = velocidad;
        this.bonificador = bonificador;
        this.estadosBase = null;
        this.estadosAlcohol = null;
        this.estadosSexuales = null;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getPrecision() {
        return precision;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getBonificador() {
        return bonificador;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public int getVidaActual() {
        return vidaActual;
    }
    
    public Estados getEstadosBase() {
        return estadosBase;
    }

    public Estados getEstadosAlcohol() {
        return estadosAlcohol;
    }

    public Estados getEstadosSexuales() {
        return estadosSexuales;
    }
    

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public void setVidaActual(int vida) {
        if(vida > vidaTotal){
        this.vidaActual = vidaTotal;
        }else{
            vidaActual = vida;
        }
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setBonificador(int bonificador) {
        this.bonificador = bonificador;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void setEstadosBase(Estados estadosBase) {
        this.estadosBase = estadosBase;
    }

    public void setEstadosAlcohol(Estados estadosAlcohol) {
        this.estadosAlcohol = estadosAlcohol;
    }

    public void setEstadosSexuales(Estados estadosSexuales) {
        this.estadosSexuales = estadosSexuales;
    }
    
    public void recibirDaño(int daño){
        if(daño<vidaActual){
        setVidaActual(vidaActual-daño);
        }else{
            setVidaActual(0);
        }
    }
    
    public int atacarHabilidad(int ataque,Personaje rival){  //RANGOS daño entre 80 y 130, ataque y armadura entre 50 y 150, vida entre 300 y 500
        double suerte =0.3;
        double daño;
        Random añadido = new Random();
        if(estadosBase != Estados.COMA){
         if(estadosBase != Estados.DORMIDO){
            if(añadido.nextInt(100)< ((ataques.get(ataque).getPrecision()*precision)/100) ){
             if(estadosBase == Estados.ENAMORADO){
                 if(añadido.nextInt(100)< 30){
                     return 0;}
                 }
             if(estadosBase == Estados.AUTISTA){
                 ataque = añadido.nextInt(4);
             }
             
        suerte += (añadido.nextDouble()*0.1);
        daño=(getAtaque()/rival.getArmadura())*(ataques.get(ataque).getDaño())*suerte*bonificador;
        if (añadido.nextInt(100)<=3) {
            daño=daño*1.3;
        }
        
        if(añadido.nextInt(100) < ataques.get(ataque).getPrecisionModStats()){
            aplicarCambiosStats(ataque,rival);
            cambiaEstado(ataques.get(ataque).getEstadoPropio(),this);
            cambiaEstado(ataques.get(ataque).getEstadoEnemigo(), rival);
        }


        if(estadosBase == Estados.CONFUSO){
            if(añadido.nextInt(100)< 50){
                daño = daño/2;
            }
        }
        return (int)daño;
                }
            }
    }
        return 0;
    }
    
    public Boolean usarObjeto(Objeto objeto,Personaje rival){  //RANGOS daño entre 80 y 130, ataque y armadura entre 50 y 150, vida entre 300 y 500
        objeto.setUsado(true);
        Random acierto = new Random ();
        if(acierto.nextInt(100)<objeto.getPrecision()){
        if(objeto.getAtaque()>0){
            double suerte =0.3;
        double daño;
        Random añadido = new Random();
        suerte += (añadido.nextDouble()*0.1);
        daño=(getAtaque()/rival.getArmadura())*(objeto.getAtaque())*suerte*bonificador;
        if (añadido.nextInt(100)<=3) {
            daño=daño*1.3;
        }  
        rival.recibirDaño((int)daño);
        }
        
        if(objeto.getModvida()!= 0){
            setVidaActual(vidaActual + objeto.getModvida());
        }
        
        if(objeto.getModataque()!= 0){
            setAtaque(ataque + objeto.getModataque());
        }
        
        if(objeto.getModataqueRival()!= 0){
            rival.setAtaque(rival.getAtaque() + objeto.getModataqueRival());
        }
        
        if(objeto.getModarmadura()!= 0){
            setArmadura(armadura +objeto.getModarmadura());
        }
        
        if(objeto.getModarmaduraRival()!= 0){
            rival.setArmadura(rival.getArmadura() + objeto.getModarmaduraRival());
        }
        
        if(objeto.getModprecision()!= 0){
            setPrecision(precision + objeto.getModprecision());
        }
        
        if(objeto.getModprecisionRival()!= 0){
            rival.setPrecision(rival.getPrecision() + objeto.getModprecisionRival());
        }
        
        if(objeto.getModvelocidad()!= 0){
            setVelocidad(velocidad + objeto.getModvelocidad());
        }
        
        if(objeto.getModvelocidadRival()!= 0){
            rival.setVelocidad(rival.getVelocidad() + objeto.getModvelocidadRival());
        }
        cambiaEstado(objeto.getEstado(),rival);
            return true;
        }else{
            return false;
        }
    }
    
    public void aplicarCambiosStats (int Nataque, Personaje rival){
        this.setVidaActual(vidaActual + ataques.get(Nataque).getModVida());
        this.setAtaque(ataque+ataques.get(Nataque).getModAtaque());
        this.setArmadura(armadura+ataques.get(Nataque).getModArmadura());
        this.setPrecision(precision+ataques.get(Nataque).getModPrecision());
        this.setVelocidad(velocidad+ataques.get(Nataque).getModVelocidadRival());
        rival.setAtaque(rival.getAtaque()+ataques.get(Nataque).getModAtaqueRival());
        rival.setArmadura(rival.getArmadura()+ataques.get(Nataque).getModArmaduraRival());
        rival.setPrecision(rival.getPrecision()+ataques.get(Nataque).getModPrecisionRival());
        rival.setVelocidad(rival.getVelocidad()+ataques.get(Nataque).getModVelocidadRival());
    }
    
    public void cambiaEstado(Estados estado, Personaje objetivo){
        if(estado == Estados.EMPORRADO ||estado == Estados.CACHONDO||estado == Estados.TILTEADO){
            objetivo.setEstadosBase(estado);
            aplicarEstadosBase(objetivo);
        }
        else if(estado == Estados.CONTENTILLO ||estado == Estados.BORRACHO||estado == Estados.COMA){
            objetivo.setEstadosAlcohol(estado);
            aplicarEstadosAlcohol(objetivo);
        }
        else if(estado == Estados.MOJADA ||estado == Estados.EMPALMADO||estado == Estados.MODOSEXO){
            objetivo.setEstadosSexuales(estado);
            aplicarEstadosSexuales(objetivo);
        }

    }

    public void aplicarEstadosBase(Personaje objetivo){
        if(objetivo.getEstadosBase() == Estados.EMPORRADO){
            objetivo.setPrecision(objetivo.getPrecision()- 15);
            objetivo.setAtaque(objetivo.getAtaque()+20);
        }
        else if(objetivo.getEstadosBase() == Estados.CACHONDO){
            objetivo.setAtaque(objetivo.getAtaque()+10);
            objetivo.setVelocidad(getVelocidad()+10);
        }
        else if(objetivo.getEstadosBase() == Estados.TILTEADO){
            objetivo.setAtaque(objetivo.getAtaque()+25);
        }
    }
    
    public void aplicarEstadosAlcohol(Personaje objetivo){
        if(objetivo.getEstadosAlcohol() == Estados.BORRACHO){
            objetivo.setVelocidad(objetivo.getVelocidad()-10);
            objetivo.setPrecision(objetivo.getPrecision()-5);
        }
    }
    
    public void aplicarEstadosSexuales(Personaje objetivo){
        if(objetivo.getEstadosSexuales() == Estados.MOJADA){
            objetivo.setArmadura(objetivo.getArmadura()-10);
        }
        else if(objetivo.getEstadosSexuales() == Estados.EMPALMADO){
            objetivo.setVelocidad(objetivo.getVelocidad()-20);
        }
    }
}
