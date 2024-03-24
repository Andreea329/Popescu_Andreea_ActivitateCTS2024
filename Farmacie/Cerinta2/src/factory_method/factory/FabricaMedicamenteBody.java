package factory_method.factory;

import factory_method.Body;
import factory_method.CategorieMedicamente;

public class FabricaMedicamenteBody implements FabricaMedicamente{
    @Override
    public CategorieMedicamente creazaMedicament(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        return new Body(nume, gramaj, pret, nrAdministrariPeZi);
    }
}
