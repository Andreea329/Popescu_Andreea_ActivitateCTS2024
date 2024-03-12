package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.PersonalSiptal;


public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSiptal createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}