package main;

import prototype.ContClient;

public class Main {
    public static void main(String[] args) {

        ContClient prototype=new ContClient(true,"Popescu Andreea","apopescu@gmail.com");
        prototype.afisareInformatii();
        ContClient spectator= (ContClient) prototype.clone();
        spectator.afisareInformatii();
        spectator.setAbonament(false);
        spectator.afisareInformatii();
        prototype.setNume("Ionescu Maria");
        prototype.afisareInformatii();
    }
}