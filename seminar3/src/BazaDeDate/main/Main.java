package BazaDeDate.main;


import BazaDeDate.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1= ConexiuneBazaDeDate.getInstance("Baza1",20,"link1");
        ConexiuneBazaDeDate conexiune2= ConexiuneBazaDeDate.getInstance("Baza2",50,"link2");

        conexiune1.setNumeBaza("Nume nou baza1");
        conexiune2.setNumeBaza("Nume nou baza2");
        
        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}