package SimpleFactory.main;

import SimpleFactory.classes.PersonalSiptal;
import SimpleFactory.classes.factory.FabricaPersonal;
import SimpleFactory.classes.factory.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {

        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSiptal medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu Maria", 9000);
        PersonalSiptal asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Popa Ana", 6000);
        PersonalSiptal bracardier = fabricaPersonal.createPersonal(TipPersonal.BANCARDIER, "Ene Ioana", 7000);
        PersonalSiptal infirmier = fabricaPersonal.createPersonal(TipPersonal.INFIRMIER, "mircea Ion", 9000);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        bracardier.afisareDetalii();

    }

}

//Personal Spital(clasa abrstracta): Bracardier, Asistent, Medic
//Fbrica contine metoda createObject care primeste ca parametru eunumul TipPersonal
//Fbarica extinde PersonalSiptal

//favricaMedic
//fabricaAsistent
//fabricaBrancardier
