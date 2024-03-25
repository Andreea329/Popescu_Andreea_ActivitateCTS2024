package factory_method.factory;

import factory_method.CategorieJucator;
import factory_method.Portar;

public class FabricaPortar implements FabricaJucator{
    @Override
    public CategorieJucator creazaJucator(String nume, String echipa, int varsta) {
        return new Portar(nume, echipa, varsta);
    }
}
