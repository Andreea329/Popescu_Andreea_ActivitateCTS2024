package FactoryMethod.main;

import FactoryMethod.classes.PersonalSiptal;
import FactoryMethod.classes.factory.*;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
        PersonalSiptal personalSpital = fabricaPersonal.createPersonal(nume, salariu);

        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();

        PersonalSiptal medic = fabricaMedic.createPersonal("Popescu Ana", 10000);
        PersonalSiptal asistemt = fabricaAsistent.createPersonal("Enescu Maria", 6000);

        medic.afisareDetalii();
        asistemt.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Butnaru Alex ", 3000);
        prelucrarePersonal(new FabricaInfirmier(), "Petrache Stela ", 6000);
    }
}