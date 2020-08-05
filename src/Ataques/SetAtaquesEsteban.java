package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesEsteban extends  ArrayList<Ataque>{

    public SetAtaquesEsteban() {
        super(4);
        this.add(new Ataque("Lloro","",50,90,80,0, 0,-10,+15, 0,0,-5,0,0 ,Estados.CONFUSO,null));
        this.add(new Ataque("Guantazo","",100,90,10,0, 0,0,0, 0,0,0,0,0 ,Estados.DORMIDO,null));
        this.add(new Ataque("Cerveza","",0,100,50,0, 0,0,10, 0,-5,0,0,0 ,Estados.CONFUSO,null));
        this.add(new Ataque("Cobra","",60,90,100,0, 0,0,0, 0,0,-10,0,0 ,null,null));


    }

}
