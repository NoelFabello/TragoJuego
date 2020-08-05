package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesAdri extends  ArrayList<Ataque>{
    public SetAtaquesAdri() {
        super(4);
        this.add(new Ataque("Adelgazar","",0,100,100,0, 15,0,-10, 0,0,-5,40,0 ,null,null));
        this.add(new Ataque("Bitch Slap","",100,90,0,0, 0,0,0, 0,0,0,0,0 ,Estados.DORMIDO,null));
        this.add(new Ataque("Rallada","",0,100,80,0, 0,0,10, 0,0,0,0,0 ,null,null));
        this.add(new Ataque("Abrazo","",70,90,60,0, 0,0,0, 0,0,0,0,0 ,Estados.CONFUSO,null));


    }

}
