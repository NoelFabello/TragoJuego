/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Nucleo.Jugador;
import static java.awt.Color.BLUE;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author saul
 */
public class PanelPrincipal extends JPanel{
    
    private Jugador jugadorIzquierda;
    private Jugador jugadorDerecha;
    private Timer timer;
    
    public PanelPrincipal(Jugador izq,Jugador der,int a,int b,int c,int d){
        super();
        
        jugadorIzquierda = izq;
        jugadorDerecha = der;
        
        this.timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                repaint();
            }
        });
        
        
        setBounds(a, b, c, d);
        setBackground(BLUE);
        timer.start();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(jugadorIzquierda.getActivo().getImagenIzquierda().getImage(), getWidth()/6, getHeight()/5, 200, 500, this);
        g.drawImage(jugadorDerecha.getActivo().getImagenDerecha().getImage(), getWidth()*4/6, getHeight()/5, 200, 500, this);
//        g.drawString(jugadorIzquierda.getActivo().Datos(), getWidth()/6, getHeight()/5-20);
//        g.drawString(jugadorDerecha.getActivo().Datos(), getWidth()*4/6, getHeight()/5-20);
//        g.
    
    }
}
