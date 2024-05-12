package main;

import classes.Persoana;
import classes.PlataCard;
import classes.PlataCash;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana();
        persoana.setPlata(new PlataCard());
        persoana.plataPersoan("Irinel");

        System.out.println(" ");

        persoana.setPlata(new PlataCash());
        persoana.plataPersoan("Maricica");
    }
}