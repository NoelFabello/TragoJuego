package Ataques;

import Nucleo.Ataque;
import Nucleo.Estados;

import java.util.ArrayList;

public class SetAtaquesPeybol extends  ArrayList<Ataque>{
    public SetAtaquesPeybol() {
        super();
        this.add(new Ataque("Pelotazo","",110,90,20,0, 0,0,0, 0,0,0,0,0 ,Estados.CONFUSO,null));
        this.add(new Ataque("Omitida","",0,80,100,0, 40,0,20, 0,0,0,0,0 ,null,Estados.AUTISTA));
        this.add(new Ataque("Rush","",0,100,100,0, 0,0,0, 0,0,0,0,0 ,Estados.TILTEADO,null));
        this.add(new Ataque("Colleja","",60,100,0,0, 0,0,0, 0,0,-10,0,0 ,null,null));


    }

}
