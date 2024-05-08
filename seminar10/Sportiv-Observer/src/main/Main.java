package main;

import observer.Abonat;
import observer.Observer;
import observer.Vecini;
import subject.Sala;
import subject.Stadion;
import subject.Subject;


public class Main {
    public static void main(String[] args) {
        Observer abonat= new Abonat("Ion");

        Observer vecini= new Vecini("Bloc 14", 13);

        Subject sala= new Sala();

        sala.adaugaAbonat(abonat);
        sala.adaugaAbonat(vecini);
        sala.notificaFotbal();
        sala.notificaFotbal();
        sala.notificaVolei();

        Subject stadion=new Stadion();

        stadion.adaugaAbonat(abonat);
        stadion.adaugaAbonat(vecini);


        // cast pentru o metoda specifica
        ((Stadion)stadion).notificaConcert();

    }
}