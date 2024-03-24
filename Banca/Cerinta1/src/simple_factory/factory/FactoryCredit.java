package simple_factory.factory;

import simple_factory.CategoriiCredite;
import simple_factory.CreditIpotecar;
import simple_factory.CreditNevPersonale;

public class FactoryCredit {
    public CategoriiCredite createCredit(TipCredit tipCredit, double suma, String titularCredit, int nrAni) throws Exception {
        switch (tipCredit){
            case CREDIT_IPOTECAR -> {
                return new CreditIpotecar(suma, titularCredit,nrAni );
            }
            case Credit_NEVOI_PEROSNALE -> {
                return new CreditNevPersonale(suma, titularCredit, nrAni);
            }
            default -> {
                throw new Exception("Nu exista un alt tip de credit!");
            }
        }
    }
}
