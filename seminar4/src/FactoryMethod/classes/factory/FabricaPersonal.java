package FactoryMethod.classes.factory;
import FactoryMethod.classes.PersonalSiptal;

public interface FabricaPersonal {
    public PersonalSiptal createPersonal(String nume, int salariu);
}
