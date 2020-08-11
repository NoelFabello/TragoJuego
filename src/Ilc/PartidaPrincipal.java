package Ilc;

import Nucleo.Campo;
import Nucleo.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PartidaPrincipal extends JFrame {
    
    private Jugador cercano;
    private Jugador lejano;
    private Campo campo;
    
    public PartidaPrincipal() {
        super();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("Fotos/FotoTrago.jfif").getImage());

        this.cercano = cercano;
        this.lejano = lejano;
//        this.campo = new Campo();
    }
    
    
    
    
    
}
