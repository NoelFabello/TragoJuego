/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Ilc.PartidaPrincipal;
import Nucleo.Jugador;
import Nucleo.Personaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author saul
 */
public class Mando extends JPanel{

    private PartidaPrincipal partida;
    
    private Jugador jugador;
    private Jugador rival;
    
    private ArrayList<JButton> BotonesLucha;
    private ArrayList<JButton> BotonesCambios;
    private ArrayList<JButton> BotonesObjetos;
    
    private JButton botonMenuCambio;
    private JButton botonMenuObjeto;
    private JButton atras;
    
    private int largo;
    private int alto;
    
    public Mando(Jugador jugador,Jugador rival, int a,int b,int c,int d, PartidaPrincipal partida) {
        super();
        setLayout(null);
        setBounds(a, b, c, d);
        
        largo = getWidth();
        alto = getHeight();
        
        this.partida = partida;
         
        this.jugador = jugador;
        this.rival = rival;
        
        this.BotonesLucha = new ArrayList<>(4);
        this.BotonesCambios = new ArrayList<>(3);
        this.BotonesObjetos = new ArrayList<>(6);
        
        BotonesLucha();
        BotonesCambios();
        BotonesControl();
    }
    
    public void BotonesControl(){
        
        botonMenuCambio = new JButton("Cambios");
        botonMenuObjeto = new JButton("Objetos");
        atras = new JButton("Atras");
        
        botonMenuCambio.setBounds(510+20,getHeight()/2-100-5,240,100);
        botonMenuObjeto.setBounds(510+20,getHeight()/2+5,240,100);
        atras.setBounds(getWidth()-120, getHeight()-100, 90, 40);
        
        botonMenuCambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BotonesControlsetVisible(false);
                BotonesLuchasetVisible(false);
                atras.setVisible(true);
                BotonesCambiossetVisible(true);
            }
        });
        botonMenuObjeto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BotonesControlsetVisible(false);
                BotonesLuchasetVisible(false);
                atras.setVisible(true);
                BotonesCambiossetVisible(false);
            }
        });
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             atras.setVisible(false);
             BotonesControlsetVisible(true);
             BotonesLuchasetVisible(true);
             BotonesCambiossetVisible(false);
            }
        });
        
        atras.setVisible(false);
        ImageIcon imagen = new ImageIcon("Descargas/atras.png");
        atras.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(atras.getWidth(), atras.getHeight(),FRAMEBITS)));

        this.add(botonMenuCambio);
        this.add(botonMenuObjeto);
        this.add(atras);
    }
    
    public void BotonesLucha(){
        int ancho = 240;
        int alto = 100;
        
        BotonLucha(0,20,(getHeight()/2)-alto-5,ancho,alto);
        BotonLucha(1,270,getHeight()/2-alto-5,ancho,alto);
        BotonLucha(2,20,getHeight()/2+5,ancho,alto);
        BotonLucha(3,270,getHeight()/2+5,ancho,alto);
        
        for (int i = 0; i < BotonesLucha.size(); i++) {
            add(BotonesLucha.get(i));
        }
    }
    
    public void BotonLucha(int ataque,int a,int b,int c,int d){
        JButton boton = new JButton(jugador.getActivo().getAtaques().get(ataque).getNombre());
        boton.setBounds(a, b, c, d);
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                jugador.setDecisionTomada(true);
                jugador.getDecision().setAtacar(true);
                jugador.getDecision().setAtaque(ataque);
                partida.ComenzarTurno();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
           
        });
        BotonesLucha.add(boton);
    }
    
    public void BotonesCambios(){
        int i = getWidth()/3-120;
        int j = 200;
        BotonCambio(0,30,getHeight()/2-140,i,j);
        BotonCambio(1,60+i,getHeight()/2-140,i,j);
        BotonCambio(2,90+2*i,getHeight()/2-140,i,j);
                
        for (int s = 0; s < BotonesCambios.size(); s++) {
            add(BotonesCambios.get(s));
        }
    }
    
    public void BotonCambio(int personaje,int a,int b,int c,int d){
        JButton boton = new JButton(jugador.getEquipo().get(personaje).getNombre());
        boton.setVisible(false);
        boton.setBounds(a, b, c, d);
        boton.setIcon(new ImageIcon((jugador.getEquipo().get(personaje).getImagenIzquierda().getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), FRAMEBITS))));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (jugador.getActivo()==jugador.getEquipo().get(personaje)) {
                        throw new Exception(jugador.getActivo().getNombre()+" ya esta combatiendo");
                    } else {
                        jugador.setDecisionTomada(true);
                        jugador.getDecision().setCambiar(true);
                        jugador.getDecision().setCambio(personaje);
                        partida.ComenzarTurno();
                    }
                } catch (Exception exc) {
                    
                }
            }
        });
        BotonesCambios.add(boton);
    }
    
    public void BotonesLuchasetVisible(boolean b){
        for (int i = 0; i < BotonesLucha.size(); i++) {
            BotonesLucha.get(i).setVisible(b);
              }
    }
    
    public void BotonesCambiossetVisible(boolean b){
        for (int i = 0; i < BotonesCambios.size(); i++) {
            BotonesCambios.get(i).setVisible(b);
             }
    }
    
    public void BotonesControlsetVisible(boolean b){
        botonMenuCambio.setVisible(b);
        botonMenuObjeto.setVisible(b);
    }
}
