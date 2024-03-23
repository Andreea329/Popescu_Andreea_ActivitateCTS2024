package factory_method.factory;

import factory_method.Supa;

public interface IFabricaSupa {
    public Supa creazaSupa(double gramaj, int pret, int nrPortiiVandute);
}
