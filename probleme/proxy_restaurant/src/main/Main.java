package main;

import classes.IRezervare;
import classes.Persoana;
import classes.ProxyNrPersoane;
import classes.RezervareMasa;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervareMasa= new RezervareMasa(12);

        Persoana persoana=new Persoana("Andreea",3,"07355321");
        rezervareMasa.rezervaMasa(persoana);

        System.out.println(" ");

        ProxyNrPersoane proxyNrPersoane=new ProxyNrPersoane(rezervareMasa,4);
        proxyNrPersoane.rezervaMasa(persoana);

    }
}