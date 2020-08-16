package Ilc;

import Interfaz.Lateral;
import Interfaz.Mando;
import Interfaz.PanelPrincipal;
import Nucleo.Campo;
import Nucleo.Jugador;
import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.red;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartidaPrincipal extends JFrame {
    
    private Jugador jugadorIzquierda;
    private Jugador jugadorDerecha;
    
    private Campo campo;
    
    private PanelPrincipal principal;
    
    private Mando mandoIzquierda;
    private Mando mandoDerecha;
    
    private Lateral lateralIzquierdo;
    private Lateral lateralDerecho;
    
    public PartidaPrincipal(Jugador jugador1, Jugador jugador2) {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1938, 1048);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("Descargas/FotoTrago.jfif").getImage());
        
        InitComponents(jugador1,jugador2);
    }

    private void InitComponents(Jugador jugador1, Jugador jugador2) {
        
        jugadorIzquierda = jugador1;
        jugadorDerecha = jugador2;
        
        mandoIzquierda = new Mando(jugadorIzquierda,jugadorDerecha ,0, getHeight()*2/3, getWidth()/2, getHeight()/3, this);
        mandoDerecha = new Mando(jugadorDerecha,jugadorIzquierda, getWidth()/2, getHeight()*2/3, getWidth()/2, getHeight()/3, this);
        
        principal = new PanelPrincipal(jugadorIzquierda,jugadorDerecha,getWidth()*3/12, 0, getWidth()*6/12, getHeight()*2/3);
        
        lateralIzquierdo = new Lateral(0, 0, getWidth()*3/12, getHeight()*2/3);
        lateralDerecho = new Lateral(getWidth()*9/12, 0, getWidth()*3/12, getHeight()*2/3);
        
        mandoIzquierda.setBackground(Color.yellow);
        mandoDerecha.setBackground(Color.black);
        
        this.add(mandoIzquierda);
        this.add(mandoDerecha);
        this.add(principal);
        this.add(lateralIzquierdo);
        this.add(lateralDerecho);    
    }
    
    public void ComenzarTurno(){
        if (jugadorIzquierda.isDecisionTomada() && jugadorDerecha.isDecisionTomada()) {
            
            if(jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isAtacar()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                
                }else{
                    
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                
                }
                
            }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isCambiar()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
               
                }else{
                    
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                
                }
                
            }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isAtacar()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                
                }else{
                    
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
               
                }
                
            }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isCambiar()) {
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    
                }else{
                    
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    
                }
            }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isUsarObjeto()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                    jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                
                }else{
                    
                    jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                    jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo());
                    
                }
                
            }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isUsarObjeto()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                
                }else{
                    
                    jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                    jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    
                }
                
            }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isAtacar()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                    
                }else{
                    
                    jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo());
                    jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                
                }
                
            }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isCambiar()) {
                
                if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
                    
                    jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                }else{
                    
                    
                    jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                
                }
            }
            
            jugadorIzquierda.setDecisionTomada(false);
            jugadorDerecha.setDecisionTomada(false);
                    }
    
    }
    
    
    
}
