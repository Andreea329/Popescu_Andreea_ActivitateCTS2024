package main;

import clase.Caracteristici;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Caracteristici caracteristici=new Caracteristici(10,15,"roz");
        Caracteristici caracteristici2=new Caracteristici(11,14,"galben");
        Caracteristici caracteristici3=new Caracteristici(10,16,"visiniu");
        Caracteristici caracteristici4=new Caracteristici(9,13,"mov");

        fabrica.getSpectator(10,10).deseneaza(caracteristici);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
        fabrica.getSpectator(10,10).deseneaza(caracteristici3);
        fabrica.getSpectator(20,10).deseneaza(caracteristici4);
    }
}