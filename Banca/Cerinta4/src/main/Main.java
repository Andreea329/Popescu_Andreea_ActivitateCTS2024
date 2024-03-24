package main;

import prototype.Cont;

public class Main {
    public static void main(String[] args) {

        Cont cont1=new Cont("Andreea Ionescu","aionescu@gmail.com",365772);
        System.out.println(cont1.toString());
        System.out.println();
        Cont cont2= (Cont) cont1.clone();
        System.out.println(cont2.toString());
    }
}