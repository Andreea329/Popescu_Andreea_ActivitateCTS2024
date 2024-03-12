package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.Medic;
import FactoryMethod.classes.PersonalSiptal;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSiptal createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }

}