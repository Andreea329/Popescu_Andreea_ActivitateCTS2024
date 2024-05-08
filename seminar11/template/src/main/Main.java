package main;

import classes.AchizitieMedicamente;
import classes.AchizitiePeBazaDeReteta;
import classes.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta=new Reteta(1);
        reteta.adaugaMedicamente("PARACETAMOL");
        reteta.adaugaMedicamente("FERVEX");

        AchizitieMedicamente achizitieMedicamentePeBazaReteta= new AchizitiePeBazaDeReteta(reteta);
        achizitieMedicamentePeBazaReteta.achizitioneazaMedicament();
    }
}