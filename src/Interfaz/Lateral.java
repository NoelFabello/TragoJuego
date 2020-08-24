/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Nucleo.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author saul
 */
public class Lateral extends JLabel{
    
    private Jugador jugador;
    
    public Lateral(Jugador j,int a,int b,int c,int d) {
        setLayout(null);
        setBounds(a, b, c, d);
        setVisible(true);
        jugador = j;
        this.setBackground(Color.GREEN);
    }
}
