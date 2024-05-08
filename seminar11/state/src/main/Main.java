package main;

import classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1= new Reteta(123,5);
        reteta1.solicitaMedicament();
        reteta1.cumparaMedicamente();

        reteta1.respingeAchizitie();

        reteta1.solicitaMedicament();
        reteta1.cumparaMedicamente();

    }
}