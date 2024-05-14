package main;

import classes.MasaDeRezervat;
import classes.Rezervata;
import classes.State;

public class Main {
    public static void main(String[] args) {
       MasaDeRezervat masaDeRezervat=new MasaDeRezervat(2);
       masaDeRezervat.rezervaMasa();
       masaDeRezervat.elibereazaMasa();

       masaDeRezervat.rezervaMasa();
       masaDeRezervat.ocupaMasa();
    }
}