package factory_method.factory;


import factory_method.Supa;
import factory_method.SupaVita;

public class FabricaSupaVita implements IFabricaSupa{
    @Override
    public Supa creazaSupa(double gramaj, int pret, int nrPortiiVandute) {
        return new SupaVita(gramaj,pret,nrPortiiVandute);
    }
}
