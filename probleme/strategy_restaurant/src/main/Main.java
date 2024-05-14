package main;

import classes.IPlata;
import classes.Persoana;
import classes.PlataCard;
import classes.PlataCash;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana();
        persoana.setPlata(new PlataCard());
        persoana.plataPersoan("Ion");

        System.out.println(" ");
        Persoana persoana1=new Persoana();
        persoana1.setPlata(new PlataCash());
        persoana1.plataPersoan("Ana");
    }
}