/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Nucleo.Jugador;
import Nucleo.Personaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author saul
 */
public class Mando extends JPanel{

    private Jugador jugador;
    private ArrayList<JButton> BotonesLucha;
    private ArrayList<JButton> BotonesCambios;
    
    private int largo;
    private int alto;
    
    public Mando(Jugador jugador,int a,int b,int c,int d) {
        super();
        setLayout(null);
        setBounds(a, b, c, d);
        
        largo = getWidth();
        alto = getHeight();
        
        this.jugador = jugador;
        this.BotonesLucha = new ArrayList<>(4);
        this.BotonesCambios = new ArrayList<>(3);
        CreaBotonesLucha();
        CreaBotonesCambios();
        
    }
    public void CreaBotonesLucha(){
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
        JButton boton = new JButton();
        boton.setBounds(a, b, c, d);boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        BotonesLucha.add(boton);
    }
    
    public void CreaBotonesCambios(){
        JButton  botonMenu= new JButton("Cambiar");
        botonMenu.setBounds(510+20,getHeight()/2-100-5,240,100);
        botonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                botonMenu.setVisible(false);
                for (int i = 1; i < 4; i++) {
                    BotonesCambios.get(i).setVisible(true);
                }
                for (int i = 0; i < 4; i++) {
                    BotonesLucha.get(i).setVisible(false);
                }
            }
        });
        BotonesCambios.add(botonMenu);
//        add(botonMenu);
//        int s = getWidth()/3-;
//        BotonCambio(0,0,2,3,4);
//        BotonCambio(1,1,2,3,4);
//        BotonCambio(2,1,2,3,4);
//                
        for (int i = 0; i < BotonesCambios.size(); i++) {
            add(BotonesCambios.get(i));
        }
    }
    
    public void BotonCambio(int personaje,int a,int b,int c,int d){
        JButton boton = new JButton(jugador.getEquipo().get(personaje).getNombre());
        boton.setVisible(false);
        boton.setBounds(a, b, c, d);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        BotonesCambios.add(boton);
    }
}
