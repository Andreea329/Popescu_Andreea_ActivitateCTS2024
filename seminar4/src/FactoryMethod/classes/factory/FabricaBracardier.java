package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.Bracardier;
import FactoryMethod.classes.PersonalSiptal;


public class FabricaBracardier implements FabricaPersonal{
    @Override
    public PersonalSiptal createPersonal(String nume, int salariu) {
        return new Bracardier(nume, salariu);
    }
}
