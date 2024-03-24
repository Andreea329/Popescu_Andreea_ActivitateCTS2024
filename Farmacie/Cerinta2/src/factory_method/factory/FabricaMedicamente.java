package factory_method.factory;

import factory_method.CategorieMedicamente;

public interface FabricaMedicamente {
    public CategorieMedicamente creazaMedicament(String nume,double gramaj, int pret, int nrAdministrariPeZi);
}
