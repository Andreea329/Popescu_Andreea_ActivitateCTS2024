package factory_method.factory;

import factory_method.Supa;
import factory_method.SupaCiuperci;

public class FabricaSupaCiuperci implements IFabricaSupa {

    @Override
    public Supa creazaSupa(double gramaj, int pret, int nrPortiiVandute) {
        return new SupaCiuperci(gramaj,pret,nrPortiiVandute);
    }
}
