package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesDudu extends  ArrayList<Ataque>{
    public SetAtaquesDudu() {
        super();
        this.add(new Ataque("Risa Pegajosa","",0,100,100,0, 0,-10,0, 0,0,-5,0,0 ,null,null));
        this.add(new Ataque("Piropo picarón","",0,80,100,0, 0,-20,0, -15,0,0,0,0 ,null,null));
        this.add(new Ataque("Tortón","",110,100,0,0, 0,0,10, 0,-5,0,0,0 ,null,null));
        this.add(new Ataque("Cubata","",0,100,100,0, 20,0,0, 0,-15,0,20,0 ,null,Estados.CONTENTILLO));
    }

}
