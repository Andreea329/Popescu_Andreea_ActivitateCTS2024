package factory_method.factory;

import factory_method.CategorieJucator;
import factory_method.Fundas;

public class FabricaFundas implements FabricaJucator{
    @Override
    public CategorieJucator creazaJucator(String nume, String echipa, int varsta) {
        return new Fundas(nume,echipa,varsta);
    }
}
