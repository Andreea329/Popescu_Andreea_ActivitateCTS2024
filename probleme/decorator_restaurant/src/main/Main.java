package main;

import decorator.Decorator;
import decorator.INota;
import decorator.NotaCuUrare;
import decorator.NotaDePlata;

public class Main {
    public static void main(String[] args) {

        INota notaDePlata= new NotaDePlata(120);
        notaDePlata.printeazaNota();

        System.out.println(" ");
        Decorator notaCuUrare= new NotaCuUrare(notaDePlata);
        notaCuUrare.adaugaUrarea();
        notaCuUrare.printeazaNota();
    }
}