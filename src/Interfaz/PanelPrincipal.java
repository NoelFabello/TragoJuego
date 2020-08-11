/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Nucleo.Jugador;
import static java.awt.Color.BLUE;
import javax.swing.JPanel;

/**
 *
 * @author saul
 */
public class PanelPrincipal extends JPanel{
    
    private Jugador jugadorIzquierda;
    private Jugador jugadorDerecha;
    
    public PanelPrincipal(Jugador izq,Jugador der,int a,int b,int c,int d){
        super();
        
        jugadorIzquierda = izq;
        jugadorDerecha = der;
        
        setBounds(a, b, c, d);
        setBackground(BLUE);
        
    
    }
}
