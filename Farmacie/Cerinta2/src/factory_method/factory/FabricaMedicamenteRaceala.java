package factory_method.factory;

import com.sun.source.tree.BreakTree;
import factory_method.CategorieMedicamente;
import factory_method.Raceala;

public class FabricaMedicamenteRaceala implements FabricaMedicamente{
    @Override
    public CategorieMedicamente creazaMedicament(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        return new Raceala(nume, gramaj, pret, nrAdministrariPeZi);
    }
}
