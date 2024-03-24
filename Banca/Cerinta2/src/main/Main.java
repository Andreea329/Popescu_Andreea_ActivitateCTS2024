package main;

import factory_method.CategorieClienti;
import factory_method.factory.FactoryClienti;
import factory_method.factory.FactoryPersoanaFizica;
import factory_method.factory.FactoryPersoanaJuridica;

public class Main {
    public static void main(String[] args) {

        FactoryClienti fabricaPersoanaJuridica=new FactoryPersoanaJuridica();
        FactoryClienti fabricaPersoanaFizica=new FactoryPersoanaFizica();

        CategorieClienti perosanaFizica= fabricaPersoanaFizica.createCredit("Pop Mirel",23424.43,"Nevoi persoanale");
        CategorieClienti persoanaJuridica=fabricaPersoanaJuridica.createCredit("Ionescu Madalin",38741.43,"Credit ipotecar");

        persoanaJuridica.detaliiClient();
        perosanaFizica.detaliiClient();

    }
}