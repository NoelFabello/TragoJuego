package Ataques;

import
        Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesNoel extends  ArrayList<Ataque>{
    public SetAtaquesNoel() {
        super();
        this.add(new Ataque("Mocha","",120,90,0,0, 0,0,0, 0,0,0,0,0 ,null,null));
        this.add(new Ataque("","",100,90,10,0, 0,0,0, 0,0,0,0,0 ,Estados.DORMIDO,null));
        this.add(new Ataque("Cerveza","",0,100,50,0, 0,0,10, 0,-5,0,0,0 ,Estados.CONFUSO,null));
        this.add(new Ataque("Cobra","",60,90,100,0, 0,0,0, 0,0,-10,0,0 ,null,null));


    }

}
