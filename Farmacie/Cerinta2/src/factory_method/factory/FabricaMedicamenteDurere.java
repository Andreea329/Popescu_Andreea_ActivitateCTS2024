package factory_method.factory;

import factory_method.CategorieMedicamente;
import factory_method.Durere;

public class FabricaMedicamenteDurere implements FabricaMedicamente {
    @Override
    public CategorieMedicamente creazaMedicament(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        return new Durere(nume, gramaj, pret, nrAdministrariPeZi);
    }
}
