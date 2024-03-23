package factory_method.factory;

import factory_method.Supa;
import factory_method.SupaLegume;

public class FabricaSupaLegume implements IFabricaSupa{

    @Override
    public Supa creazaSupa(double gramaj, int pret, int nrPortiiVandute) {
        return  new SupaLegume(gramaj,pret,nrPortiiVandute);
    }
}
