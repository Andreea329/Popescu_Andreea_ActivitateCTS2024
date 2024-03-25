package factory_method.factory;

import factory_method.Atacant;
import factory_method.CategorieJucator;

public class FabricaAtacant implements FabricaJucator{
    @Override
    public CategorieJucator creazaJucator(String nume, String echipa, int varsta) {
        return new Atacant(nume,echipa,varsta);
    }
}
