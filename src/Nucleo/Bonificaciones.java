package Nucleo;

import Personajes.Adri;
import sun.jvm.hotspot.debugger.Address;
import sun.jvm.hotspot.utilities.IntArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Bonificaciones {
    private double[][] TablaBonificaciones;
    private final int Adri = 1;
    private final int Dudu = 2;
    private final int Esteban = 3;
    private final int Fasero = 4;
    private final int Jatopelado = 5;
    private final int Javier = 6;
    private final int Josito = 7;
    private final int Miranda = 8;
    private final int Misswey = 9;
    private final int Noel = 10;
    private final int Noelia = 11;
    private final int Peybol = 12;
    private final int Ryharuk = 13;
    private final int Sulo = 14;

    public Bonificaciones() {
        TablaBonificaciones = new double[14][14];
        TablaBonificaciones[Adri][Adri] = 1;
        TablaBonificaciones[Adri][Dudu] = 1.5;
        TablaBonificaciones[Adri][Esteban] = 1.5;
        TablaBonificaciones[Adri][Fasero] = 1;
        TablaBonificaciones[Adri][Jatopelado] = 1;
        TablaBonificaciones[Adri][Javier] = 0.5;
        TablaBonificaciones[Adri][Josito] = 1;
        TablaBonificaciones[Adri][Miranda] = 0.5;
        TablaBonificaciones[Adri][Misswey] = 1;
        TablaBonificaciones[Adri][Noel] = 1;
        TablaBonificaciones[Adri][Noelia] = 1;
        TablaBonificaciones[Adri][Peybol] = 1;
        TablaBonificaciones[Adri][Ryharuk] = 1;
        TablaBonificaciones[Adri][Sulo] = 1;
        TablaBonificaciones[Dudu][Adri] = 1.5;
        TablaBonificaciones[Dudu][Dudu] = 1;
        TablaBonificaciones[Dudu][Esteban] = 1;
        TablaBonificaciones[Dudu][Fasero] = 0.5;
        TablaBonificaciones[Dudu][Jatopelado] = 1;
        TablaBonificaciones[Dudu][Javier] = 1;
        TablaBonificaciones[Dudu][Josito] = 1;
        TablaBonificaciones[Dudu][Miranda] = 1;
        TablaBonificaciones[Dudu][Misswey] = 1.5;
        TablaBonificaciones[Dudu][Noel] = 0.5;
        TablaBonificaciones[Dudu][Noelia] = 0.5;
        TablaBonificaciones[Dudu][Peybol] = 1.5;
        TablaBonificaciones[Dudu][Ryharuk] = 1;
        TablaBonificaciones[Dudu][Sulo] = 1;
        TablaBonificaciones[Esteban][Adri] = 0.5;
        TablaBonificaciones[Esteban][Dudu] = 1;
        TablaBonificaciones[Esteban][Esteban] = 1;
        TablaBonificaciones[Esteban][Fasero] =1;
        TablaBonificaciones[Esteban][Jatopelado] =1.5;
        TablaBonificaciones[Esteban][Javier] =0.5;
        TablaBonificaciones[Esteban][Josito] = 0.5;
        TablaBonificaciones[Esteban][Miranda] = 1;
        TablaBonificaciones[Esteban][Misswey] = 1;
        TablaBonificaciones[Esteban][Noel] = 1;
        TablaBonificaciones[Esteban][Noelia] = 1.5;
        TablaBonificaciones[Esteban][Peybol] = 1;
        TablaBonificaciones[Esteban][Ryharuk] = 1.5;
        TablaBonificaciones[Esteban][Sulo] = 1;
        TablaBonificaciones[Fasero][Adri] = ;
        TablaBonificaciones[Fasero][Dudu] = ;
        TablaBonificaciones[Fasero][Esteban] = ;
        TablaBonificaciones[Fasero][Fasero] =;
        TablaBonificaciones[Fasero][Jatopelado] =;
        TablaBonificaciones[Fasero][Javier] =;
        TablaBonificaciones[Fasero][Josito] = ;
        TablaBonificaciones[Fasero][Miranda] = ;
        TablaBonificaciones[Fasero][Misswey] = ;
        TablaBonificaciones[Fasero][Noel] = ;
        TablaBonificaciones[Fasero][Noelia] = ;
        TablaBonificaciones[Fasero][Peybol] = ;
        TablaBonificaciones[Fasero][Ryharuk] = ;
        TablaBonificaciones[Fasero][Sulo] = ;


    }
}
