package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.Infirmier;
import FactoryMethod.classes.PersonalSiptal;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSiptal createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}