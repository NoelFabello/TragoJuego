package Ilc;

import Interfaz.Mando;
import Interfaz.PanelPrincipal;
import Nucleo.Campo;
import Nucleo.Jugador;
import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.red;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public PartidaPrincipal(Jugador jugador1, Jugador jugador2) {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1938, 1048);
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
        
        mandoIzquierda.setBackground(Color.yellow);
        mandoDerecha.setBackground(Color.black);
        
        this.add(principal);
        this.add(mandoIzquierda);
        this.add(mandoDerecha);
    }
    
    public void ComenzarTurno() throws InterruptedException{
        if (jugadorIzquierda.isDecisionTomada() && jugadorDerecha.isDecisionTomada()) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        LosIfs();
                    } catch (InterruptedException ex) {
                        System.out.println("Puta madre wey");
                    }
            
            jugadorIzquierda.setDecisionTomada(false);
            jugadorDerecha.setDecisionTomada(false);
            jugadorIzquierda.decisionesFalse();
            jugadorIzquierda.decisionesFalse();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        
    }
    
    public void LosIfs() throws InterruptedException{
    
        if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
            
            Jugador1Primero();
            
        } else if (jugadorIzquierda.getActivo().AtacaPrimero(jugadorDerecha.getActivo())) {
            
            Jugador2Primero();
        
        }else{
        
            Random rnd = new Random();
            if (rnd.nextBoolean() == true) {
                
                Jugador1Primero();
                
            }else{
                
                Jugador2Primero();
            
            }
        }
    
    }

    private void Jugador1Primero() throws InterruptedException {
    
        if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
                
        }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
            Thread.sleep(2000);
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());

        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
                    
        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    
        }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isUsarObjeto()) {
            
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
            Thread.sleep(2000);
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                    
        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isUsarObjeto()) {
             
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
                
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
                    
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
            Thread.sleep(2000);
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
                    
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isUsarObjeto()) {
            
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
            Thread.sleep(2000);
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
        
        }
    }

    private void Jugador2Primero() throws InterruptedException {
     
        if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
            Thread.sleep(2000);
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
            
        }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
                    
        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
            Thread.sleep(2000);
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());

        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    
        }else if (jugadorIzquierda.getDecision().isAtacar() && jugadorDerecha.getDecision().isUsarObjeto()) {
            
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
            Thread.sleep(2000);
            jugadorDerecha.getActivo().setVidaActual(jugadorIzquierda.getActivo().atacarHabilidad(jugadorIzquierda.getDecision().getAtaque(), jugadorDerecha.getActivo()));
                    
        }else if (jugadorIzquierda.getDecision().isCambiar() && jugadorDerecha.getDecision().isUsarObjeto()) {
            
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());
            Thread.sleep(2000);
            jugadorIzquierda.cambiarActivo(jugadorIzquierda.getDecision().getCambio());
                    
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isAtacar()) {
            
            jugadorIzquierda.getActivo().setVidaActual(jugadorDerecha.getActivo().atacarHabilidad(jugadorDerecha.getDecision().getAtaque(), jugadorIzquierda.getActivo()));
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isCambiar()) {
            
            jugadorDerecha.cambiarActivo(jugadorDerecha.getDecision().getCambio());
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                
        }else if (jugadorIzquierda.getDecision().isUsarObjeto() && jugadorDerecha.getDecision().isUsarObjeto()) {
        
            jugadorDerecha.getActivo().usarObjeto(jugadorDerecha.getObjetos().get(jugadorDerecha.getDecision().getObjeto()), jugadorIzquierda.getActivo());    
            Thread.sleep(2000);
            jugadorIzquierda.getActivo().usarObjeto(jugadorIzquierda.getObjetos().get(jugadorIzquierda.getDecision().getObjeto()), jugadorDerecha.getActivo());
                
        }
        
    }
   
    
}
