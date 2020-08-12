package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesRyharuk extends  ArrayList<Ataque>{
    public SetAtaquesRyharuk() {
        super();
    this.add(
        new Ataque(
            "Perreo Intenso",
            "",
            0,
            90,
            100,
            +20,
            +10,
            0,
            +10,
            0,
            0,
            0,
            0,
            0,
            Estados.ENAMORADO,
            Estados.CACHONDO));
        this.add(new Ataque("Omitida","",0,80,100,0, 40,0,20, 0,0,0,0,0 ,null,Estados.AUTISTA));
        this.add(new Ataque(" ","",0,100,100,0, 0,0,0, 0,0,0,0,0 ,Estados.TILTEADO,null));
        this.add(new Ataque("Patada","",60,100,0,0, 0,0,0, 0,0,0,0,0 ,null,null));


    }

}
