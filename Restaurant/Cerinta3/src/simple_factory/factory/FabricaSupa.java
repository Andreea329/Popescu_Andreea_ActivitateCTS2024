package simple_factory.factory;

import simple_factory.*;

public class FabricaSupa {

    public  Supa creazaSupa( TipSupa tipSupa, double gramaj, int pret, int nrPortiiVandute) throws Exception {
        switch (tipSupa){
            case CIUPERCI -> {
                return new SupaCiuperci(gramaj,pret,nrPortiiVandute);
            }
            case LEGUME -> {
                return new SupaLegume(gramaj,pret,nrPortiiVandute);
            }
            case VITA -> {
                return new SupaVita(gramaj, pret,nrPortiiVandute);
            }
            case PUI -> {
                return new SupaPui(gramaj, pret, nrPortiiVandute);
            }

            default -> {
                throw new Exception("Nu exista alt tip de supa!");
            }
        }
    }
}
