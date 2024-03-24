package simple_factory.factory;

import simple_factory.Body;
import simple_factory.CategorieMedicamente;
import simple_factory.Durere;
import simple_factory.Raceala;

public class FabricaMedicamente {

    public CategorieMedicamente creazaMedicamente(TipMedicament tipMedicament, String nume, double gramaj,int pret,int nrAdministrariPeZi) throws Exception {
        switch (tipMedicament){
            case BODY -> {
                Body body= new Body(nume,gramaj,pret,nrAdministrariPeZi);
                return body;
            }
            case DURERE -> {
                Durere durere=new Durere(nume,gramaj,pret,nrAdministrariPeZi);
                return durere;
            }
            case RACEALA -> {
                Raceala raceala=new Raceala(nume,gramaj,pret,nrAdministrariPeZi);
                return raceala;
            }
            default -> {
                throw new Exception("Nu exista alta categorie de medicamente.");
            }
        }
    }

}
