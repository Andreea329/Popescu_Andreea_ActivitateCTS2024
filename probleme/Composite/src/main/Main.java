package main;

import classes.Items;
import classes.Sectiune;
import classes.StructuraAbstracta;
import classes.Subsectiune;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta bauturi = new Sectiune("Băuturi");
        StructuraAbstracta bauturiReci = new Subsectiune("Bauturi reci");
        StructuraAbstracta bauturiCalde = new Subsectiune("Bauturi calde");

        bauturiReci.adaugaStructura(new Items("Suc de portocale"));
        bauturiCalde.adaugaStructura(new Items("Ceai"));

        bauturi.adaugaStructura(bauturiReci);
        bauturi.adaugaStructura(bauturiCalde);

        bauturi.afiseazaDetalii(" ");
    }
}
