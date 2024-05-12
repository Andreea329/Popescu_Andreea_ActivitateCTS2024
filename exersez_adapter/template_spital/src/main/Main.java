package main;

import classes.Pacient;
import classes.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spital= new Spital("Colentina",2);
        spital.internare(new Pacient("Nitica","grava"));
        spital.internare(new Pacient("Lica","agravata"));
        spital.internare(new Pacient("Gigel","agravata"));

    }
}