package main;

import observer.Observer;
import observer.Pacient;
import subject.Spital;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer pacient=new Pacient("Ion");
        Subject spital=new Spital();

        spital.adaugaPacient(pacient);
        spital.notificaEpidemie();

    }
}