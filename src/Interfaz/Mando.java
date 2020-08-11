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
        CreaBotonesLucha();
        
    }
    public void CreaBotonesLucha(){
        int ancho = 200;
        int alto = 60;
        
        Boton(0,20,60,ancho,alto);
        Boton(1,230,60,ancho,alto);
        Boton(2,20,130,ancho,alto);
        Boton(3,230,130,ancho,alto);
        
        for (int i = 0; i < BotonesLucha.size(); i++) {
            add(BotonesLucha.get(i));
        }
    }
    public void Boton(int ataque,int a,int b,int c,int d){
        JButton boton = new JButton();
        boton.setBounds(a, b, c, d);boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        BotonesLucha.add(boton);
    }
}
