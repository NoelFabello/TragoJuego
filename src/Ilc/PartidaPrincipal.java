package Ilc;

import Nucleo.Campo;
import Nucleo.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartidaPrincipal extends JFrame {
    
    private Jugador jugadorIzquierda;
    private Jugador jugadorDerecha;
    private Campo campo;
    private JPanel principal;
    
    public PartidaPrincipal() {
        super();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("Fotos/FotoTrago.jfif").getImage());
        

    }
    
    
    
    
    
}
