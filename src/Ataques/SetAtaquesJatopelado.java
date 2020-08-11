package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesJatopelado extends ArrayList<Ataque> {
    public SetAtaquesJatopelado() {
        super(4);
        this.add(new Ataque("Mar de Lagrimas", "", 110, 100, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, Estados.ESTRESADO, null));
        this.add(new Ataque("Peste Otaku", "", 0, 80, 100, 0, -20, 0, 0, 0, 0, 0, 0, 0, null, null));
        this.add(new Ataque("", "", 0, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, Estados.TILTEADO, null));
        this.add(new Ataque("Ostia", "", 60, 100, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, null, null));


    }

}