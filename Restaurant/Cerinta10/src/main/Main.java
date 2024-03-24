package main;

import prototype.ContClient;
import prototype.RezervarePrototype;

public class Main {
    public static void main(String[] args) {
        ContClient contClient=new ContClient("Andreea","0738236","apopescu@gmail.com");
        ContClient contClient2=new ContClient("Ioana","0738436","ioana@gmail.com");

        RezervarePrototype prototype= new RezervarePrototype(10,2,"19:00", contClient );
        System.out.println(prototype.toString());

        RezervarePrototype prototype2= (RezervarePrototype) prototype.clone();
        System.out.println();

        prototype2.setNrMasa(12);
        prototype2.setOraRezervare("20:00");
        System.out.println(prototype2);


    }
}