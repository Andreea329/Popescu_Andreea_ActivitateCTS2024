package main;

import simple_factory.CategoriiCredite;
import simple_factory.factory.FactoryCredit;
import simple_factory.factory.TipCredit;

public class Main {
    public static void main(String[] args) {

        try {

            FactoryCredit factoryCredit=new FactoryCredit();

            CategoriiCredite creditIpotecar= factoryCredit.createCredit(TipCredit.CREDIT_IPOTECAR,23574,"Neacsu Marius",10);
            CategoriiCredite creditNevoi= factoryCredit.createCredit(TipCredit.Credit_NEVOI_PEROSNALE,1320,"Georgescu Radu",12);

            creditIpotecar.detaliiCredit();
            creditNevoi.detaliiCredit();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}