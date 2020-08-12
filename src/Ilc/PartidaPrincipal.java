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
        
        super();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1938, 1048);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("Fotos/FotoTrago.jfif").getImage());
        
        InitComponents(jugador1,jugador2);
    }

    private void InitComponents(Jugador jugador1, Jugador jugador2) {
        
        jugadorIzquierda = jugador1;
        jugadorDerecha = jugador2;
        
        principal = new PanelPrincipal(jugadorIzquierda,jugadorDerecha,getWidth()*3/12, 0, getWidth()*6/12, getHeight()*2/3);
        
        mandoIzquierda = new Mando(jugadorIzquierda, 0, getHeight()*2/3, getWidth()/2, getHeight()/3);
        mandoDerecha = new Mando(jugadorDerecha, getWidth()/2, getHeight()*2/3, getWidth()/2, getHeight()/3);
        
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
    
    
    
    
    
}
