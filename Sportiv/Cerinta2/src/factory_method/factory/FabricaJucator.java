package factory_method.factory;

import factory_method.CategorieJucator;

public interface FabricaJucator {
    public CategorieJucator creazaJucator(String nume, String echipa, int varsta);
}
