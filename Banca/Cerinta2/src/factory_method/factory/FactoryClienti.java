package factory_method.factory;

import factory_method.CategorieClienti;

public interface FactoryClienti {
    public CategorieClienti createCredit(String nume, double valoareCredit, String tipCredit);
}
