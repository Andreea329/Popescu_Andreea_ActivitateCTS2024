package factory_method.factory;

import factory_method.CategorieClienti;
import factory_method.PrsoanaFizica;

public class FactoryPersoanaJuridica implements FactoryClienti{
    @Override
    public CategorieClienti createCredit(String nume, double valoareCredit, String tipCredit) {
        return new PrsoanaFizica(nume, valoareCredit, tipCredit);
    }
}
