package Ilc;

import Nucleo.Campo;
import Nucleo.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartidaPrincipal extends JFrame {
    
    private Jugador cercano;
    private Jugador lejano;
    private Campo campo;
    private JPanel pantalla;
    
    public PartidaPrincipal() {
        super();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("Fotos/FotoTrago.jfif").getImage());
        System.out.println("Me cago en dios");
        this.cercano = cercano;
        this.lejano = lejano;
//        this.campo = new Campo();
    }
    
    
    
    
    
}
