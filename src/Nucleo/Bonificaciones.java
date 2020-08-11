package Nucleo;

import Personajes.*;

public class Bonificaciones {
  private final int Adri = 0;
  private final int Dudu = 1;
  private final int Esteban = 2;
  private final int Fasero = 3;
  private final int Jatopelado = 4;
  private final int Javier = 5;
  private final int Josito = 6;
  private final int Miranda = 7;
  private final int Misswey = 8;
  private final int Noel = 9;
  private final int Noelia = 10;
  private final int Peybol = 11;
  private final int Ryharuk = 12;
  private final int Sulo = 13;
  private final double[][] TablaBonificaciones;

  public Bonificaciones() {
    TablaBonificaciones = new double[14][14];
    TablaBonificaciones[Adri][Adri] = 1;
    TablaBonificaciones[Adri][Dudu] = 1.15;
    TablaBonificaciones[Adri][Esteban] = 1.15;
    TablaBonificaciones[Adri][Fasero] = 1;
    TablaBonificaciones[Adri][Jatopelado] = 1;
    TablaBonificaciones[Adri][Javier] = 0.85;
    TablaBonificaciones[Adri][Josito] = 1;
    TablaBonificaciones[Adri][Miranda] = 0.85;
    TablaBonificaciones[Adri][Misswey] = 1;
    TablaBonificaciones[Adri][Noel] = 1;
    TablaBonificaciones[Adri][Noelia] = 1;
    TablaBonificaciones[Adri][Peybol] = 1;
    TablaBonificaciones[Adri][Ryharuk] = 1;
    TablaBonificaciones[Adri][Sulo] = 1;
    TablaBonificaciones[Dudu][Adri] = 1.15;
    TablaBonificaciones[Dudu][Dudu] = 1;
    TablaBonificaciones[Dudu][Esteban] = 1;
    TablaBonificaciones[Dudu][Fasero] = 0.85;
    TablaBonificaciones[Dudu][Jatopelado] = 1;
    TablaBonificaciones[Dudu][Javier] = 1;
    TablaBonificaciones[Dudu][Josito] = 1;
    TablaBonificaciones[Dudu][Miranda] = 1;
    TablaBonificaciones[Dudu][Misswey] = 1.15;
    TablaBonificaciones[Dudu][Noel] = 0.85;
    TablaBonificaciones[Dudu][Noelia] = 0.85;
    TablaBonificaciones[Dudu][Peybol] = 1.15;
    TablaBonificaciones[Dudu][Ryharuk] = 1;
    TablaBonificaciones[Dudu][Sulo] = 1;
    TablaBonificaciones[Esteban][Adri] = 0.85;
    TablaBonificaciones[Esteban][Dudu] = 1;
    TablaBonificaciones[Esteban][Esteban] = 1;
    TablaBonificaciones[Esteban][Fasero] = 1;
    TablaBonificaciones[Esteban][Jatopelado] = 1.15;
    TablaBonificaciones[Esteban][Javier] = 0.85;
    TablaBonificaciones[Esteban][Josito] = 0.85;
    TablaBonificaciones[Esteban][Miranda] = 1;
    TablaBonificaciones[Esteban][Misswey] = 1;
    TablaBonificaciones[Esteban][Noel] = 1;
    TablaBonificaciones[Esteban][Noelia] = 1.15;
    TablaBonificaciones[Esteban][Peybol] = 1;
    TablaBonificaciones[Esteban][Ryharuk] = 1.15;
    TablaBonificaciones[Esteban][Sulo] = 1;
    TablaBonificaciones[Fasero][Adri] = 1;
    TablaBonificaciones[Fasero][Dudu] = 1.15;
    TablaBonificaciones[Fasero][Esteban] = 1;
    TablaBonificaciones[Fasero][Fasero] = 1;
    TablaBonificaciones[Fasero][Jatopelado] = 1;
    TablaBonificaciones[Fasero][Javier] = 1;
    TablaBonificaciones[Fasero][Josito] = 0.85;
    TablaBonificaciones[Fasero][Miranda] = 1;
    TablaBonificaciones[Fasero][Misswey] = 1;
    TablaBonificaciones[Fasero][Noel] = 1.15;
    TablaBonificaciones[Fasero][Noelia] = 0.85;
    TablaBonificaciones[Fasero][Peybol] = 1.15;
    TablaBonificaciones[Fasero][Ryharuk] = 1;
    TablaBonificaciones[Fasero][Sulo] = 0.85;
    TablaBonificaciones[Jatopelado][Adri] = 1;
    TablaBonificaciones[Jatopelado][Dudu] = 1;
    TablaBonificaciones[Jatopelado][Esteban] = 0.85;
    TablaBonificaciones[Jatopelado][Fasero] = 1;
    TablaBonificaciones[Jatopelado][Jatopelado] = 1;
    TablaBonificaciones[Jatopelado][Javier] = 1;
    TablaBonificaciones[Jatopelado][Josito] = 1.15;
    TablaBonificaciones[Jatopelado][Miranda] = 0.85;
    TablaBonificaciones[Jatopelado][Misswey] = 1;
    TablaBonificaciones[Jatopelado][Noel] = 1.15;
    TablaBonificaciones[Jatopelado][Noelia] = 1.15;
    TablaBonificaciones[Jatopelado][Peybol] = 1;
    TablaBonificaciones[Jatopelado][Ryharuk] = 0.85;
    TablaBonificaciones[Jatopelado][Sulo] = 1;
    TablaBonificaciones[Javier][Adri] = 1.15;
    TablaBonificaciones[Javier][Dudu] = 1;
    TablaBonificaciones[Javier][Esteban] = 0.85;
    TablaBonificaciones[Javier][Fasero] = 1;
    TablaBonificaciones[Javier][Jatopelado] = 1;
    TablaBonificaciones[Javier][Javier] = 1;
    TablaBonificaciones[Javier][Josito] = 1.15;
    TablaBonificaciones[Javier][Miranda] = 0.85;
    TablaBonificaciones[Javier][Misswey] = 1;
    TablaBonificaciones[Javier][Noel] = 0.85;
    TablaBonificaciones[Javier][Noelia] = 1;
    TablaBonificaciones[Javier][Peybol] = 1;
    TablaBonificaciones[Javier][Ryharuk] = 1;
    TablaBonificaciones[Javier][Sulo] = 1.15;
    TablaBonificaciones[Josito][Adri] = 1;
    TablaBonificaciones[Josito][Dudu] = 1;
    TablaBonificaciones[Josito][Esteban] = 1.15;
    TablaBonificaciones[Josito][Fasero] = 0.85;
    TablaBonificaciones[Josito][Jatopelado] = 0.85;
    TablaBonificaciones[Josito][Javier] = 1.15;
    TablaBonificaciones[Josito][Josito] = 1;
    TablaBonificaciones[Josito][Miranda] = 1.15;
    TablaBonificaciones[Josito][Misswey] = 0.85;
    TablaBonificaciones[Josito][Noel] = 1;
    TablaBonificaciones[Josito][Noelia] = 1;
    TablaBonificaciones[Josito][Peybol] = 1;
    TablaBonificaciones[Josito][Ryharuk] = 1;
    TablaBonificaciones[Josito][Sulo] = 1;
    TablaBonificaciones[Miranda][Adri] = 0.85;
    TablaBonificaciones[Miranda][Dudu] = 1;
    TablaBonificaciones[Miranda][Esteban] = 1;
    TablaBonificaciones[Miranda][Fasero] = 1;
    TablaBonificaciones[Miranda][Jatopelado] = 1.15;
    TablaBonificaciones[Miranda][Javier] = 1.15;
    TablaBonificaciones[Miranda][Josito] = 0.85;
    TablaBonificaciones[Miranda][Miranda] = 1;
    TablaBonificaciones[Miranda][Misswey] = 1;
    TablaBonificaciones[Miranda][Noel] = 0.85;
    TablaBonificaciones[Miranda][Noelia] = 1;
    TablaBonificaciones[Miranda][Peybol] = 1;
    TablaBonificaciones[Miranda][Ryharuk] = 1.15;
    TablaBonificaciones[Miranda][Sulo] = 1;
    TablaBonificaciones[Misswey][Adri] = 1;
    TablaBonificaciones[Misswey][Dudu] = 0.85;
    TablaBonificaciones[Misswey][Esteban] = 1;
    TablaBonificaciones[Misswey][Fasero] = 1;
    TablaBonificaciones[Misswey][Jatopelado] = 1;
    TablaBonificaciones[Misswey][Javier] = 1;
    TablaBonificaciones[Misswey][Josito] = 1.15;
    TablaBonificaciones[Misswey][Miranda] = 1;
    TablaBonificaciones[Misswey][Misswey] = 1;
    TablaBonificaciones[Misswey][Noel] = 1;
    TablaBonificaciones[Misswey][Noelia] = 0.85;
    TablaBonificaciones[Misswey][Peybol] = 1.15;
    TablaBonificaciones[Misswey][Ryharuk] = 0.85;
    TablaBonificaciones[Misswey][Sulo] = 1.15;
    TablaBonificaciones[Noel][Adri] = 1;
    TablaBonificaciones[Noel][Dudu] = 0.85;
    TablaBonificaciones[Noel][Esteban] = 1;
    TablaBonificaciones[Noel][Fasero] = 0.85;
    TablaBonificaciones[Noel][Jatopelado] = 1.15;
    TablaBonificaciones[Noel][Javier] = 1.15;
    TablaBonificaciones[Noel][Josito] = 1;
    TablaBonificaciones[Noel][Miranda] = 1.15;
    TablaBonificaciones[Noel][Misswey] = 1;
    TablaBonificaciones[Noel][Noel] = 1;
    TablaBonificaciones[Noel][Noelia] = 1;
    TablaBonificaciones[Noel][Peybol] = 0.85;
    TablaBonificaciones[Noel][Ryharuk] = 1;
    TablaBonificaciones[Noel][Sulo] = 1;
    TablaBonificaciones[Noelia][Adri] = 1;
    TablaBonificaciones[Noelia][Dudu] = 1.15;
    TablaBonificaciones[Noelia][Esteban] = 1.15;
    TablaBonificaciones[Noelia][Fasero] = 1.15;
    TablaBonificaciones[Noelia][Jatopelado] = 0.85;
    TablaBonificaciones[Noelia][Javier] = 1;
    TablaBonificaciones[Noelia][Josito] = 1;
    TablaBonificaciones[Noelia][Miranda] = 1;
    TablaBonificaciones[Noelia][Misswey] = 0.85;
    TablaBonificaciones[Noelia][Noel] = 1;
    TablaBonificaciones[Noelia][Noelia] = 1;
    TablaBonificaciones[Noelia][Peybol] = 1;
    TablaBonificaciones[Noelia][Ryharuk] = 1;
    TablaBonificaciones[Noelia][Sulo] = 0.85;
    TablaBonificaciones[Peybol][Adri] = 1;
    TablaBonificaciones[Peybol][Dudu] = 0.85;
    TablaBonificaciones[Peybol][Esteban] = 1;
    TablaBonificaciones[Peybol][Fasero] = 1.15;
    TablaBonificaciones[Peybol][Jatopelado] = 1;
    TablaBonificaciones[Peybol][Javier] = 1;
    TablaBonificaciones[Peybol][Josito] = 1;
    TablaBonificaciones[Peybol][Miranda] = 1;
    TablaBonificaciones[Peybol][Misswey] = 0.85;
    TablaBonificaciones[Peybol][Noel] = 1.15;
    TablaBonificaciones[Peybol][Noelia] = 1;
    TablaBonificaciones[Peybol][Peybol] = 1;
    TablaBonificaciones[Peybol][Ryharuk] = 1.15;
    TablaBonificaciones[Peybol][Sulo] = 0.85;
    TablaBonificaciones[Ryharuk][Adri] = 1.15;
    TablaBonificaciones[Ryharuk][Dudu] = 1;
    TablaBonificaciones[Ryharuk][Esteban] = 0.85;
    TablaBonificaciones[Ryharuk][Fasero] = 1;
    TablaBonificaciones[Ryharuk][Jatopelado] = 0.85;
    TablaBonificaciones[Ryharuk][Javier] = 1;
    TablaBonificaciones[Ryharuk][Josito] = 1;
    TablaBonificaciones[Ryharuk][Miranda] = 1.15;
    TablaBonificaciones[Ryharuk][Misswey] = 1.15;
    TablaBonificaciones[Ryharuk][Noel] = 1;
    TablaBonificaciones[Ryharuk][Noelia] = 1;
    TablaBonificaciones[Ryharuk][Peybol] = 0.85;
    TablaBonificaciones[Ryharuk][Ryharuk] = 1;
    TablaBonificaciones[Ryharuk][Sulo] = 1;
    TablaBonificaciones[Sulo][Adri] = 0.85;
    TablaBonificaciones[Sulo][Dudu] = 1;
    TablaBonificaciones[Sulo][Esteban] = 1;
    TablaBonificaciones[Sulo][Fasero] = 1.15;
    TablaBonificaciones[Sulo][Jatopelado] = 1;
    TablaBonificaciones[Sulo][Javier] = 0.85;
    TablaBonificaciones[Sulo][Josito] = 1;
    TablaBonificaciones[Sulo][Miranda] = 1;
    TablaBonificaciones[Sulo][Misswey] = 1.15;
    TablaBonificaciones[Sulo][Noel] = 1;
    TablaBonificaciones[Sulo][Noelia] = 1.15;
    TablaBonificaciones[Sulo][Peybol] = 0.85;
    TablaBonificaciones[Sulo][Ryharuk] = 1;
    TablaBonificaciones[Sulo][Sulo] = 1;
  }

  public double aplicarBonificaciones(Personaje atacante, Personaje rival) {
    int ATACA = 0, RIVAL = 0;
      if (atacante instanceof Adri) {
        ATACA = Adri;
      }
      else if (atacante instanceof Dudu) {
        ATACA = Dudu;
      }
      else if (atacante instanceof Esteban) {
        ATACA = Esteban;
      }
      else if (atacante instanceof Fasero) {
        ATACA = Fasero;
      }
      else if (atacante instanceof Jatopelado) {
        ATACA = Jatopelado;
      }
      else if (atacante instanceof Javier) {
        ATACA = Javier;
      }
      else if (atacante instanceof Josito) {
        ATACA = Josito;
      }
      else if (atacante instanceof Miranda) {
        ATACA = Miranda;
      }
      else if (atacante instanceof Misswey) {
        ATACA = Misswey;
      }
      else if (atacante instanceof Noel) {
        ATACA = Noel;
      }
      else if (atacante instanceof Noelia) {
        ATACA = Noelia;
      }
      else if (atacante instanceof Peybol) {
        ATACA = Peybol;
      }
      else if (atacante instanceof Ryharuk) {
        ATACA = Ryharuk;
      }
      else if (atacante instanceof Sulo) {
        ATACA = Sulo;
      }
      if (rival instanceof Adri) {
        RIVAL = Adri;
      }
      else if (rival instanceof Dudu) {
        RIVAL = Dudu;
      }
      else if (rival instanceof Esteban) {
        RIVAL = Esteban;
      }
      else if (rival instanceof Fasero) {
        RIVAL = Fasero;
      }
      else if (rival instanceof Jatopelado) {
        RIVAL = Jatopelado;
      }
      else if (rival instanceof Javier) {
        RIVAL = Javier;
      }
      else if (rival instanceof Josito) {
        RIVAL = Josito;
      }
      else if (rival instanceof Miranda) {
        RIVAL = Miranda;
      }
      else if (rival instanceof Misswey) {
        RIVAL = Misswey;
      }
      else if (rival instanceof Noel) {
        ATACA = Noel;
      }
      else if (rival instanceof Noelia) {
        RIVAL = Noelia;
      }
      else if (rival instanceof Peybol) {
        RIVAL = Peybol;
      }
      else if (rival instanceof Ryharuk) {
        RIVAL = Ryharuk;
      }
      else if (rival instanceof Sulo) {
        RIVAL = Sulo;
      }
    return TablaBonificaciones[ATACA][RIVAL];
  }
}
