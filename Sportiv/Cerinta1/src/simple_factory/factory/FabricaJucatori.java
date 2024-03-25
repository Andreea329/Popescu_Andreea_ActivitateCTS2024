package simple_factory.factory;

import simple_factory.Atacant;
import simple_factory.CategorieJucator;
import simple_factory.Fundas;
import simple_factory.Portar;

public class FabricaJucatori {
    public CategorieJucator creazaJucator(TipJucator tipJucator, String nume, String echipa, int varsta ){
        switch (tipJucator){
            case PORTAR -> {
                return new Portar(nume,echipa,varsta);
            }
            case FUNDAS -> {
                return new Fundas(nume,echipa,varsta);
            }
            case ATACANT -> {
                return new Atacant(nume,echipa,varsta);
            }
            default -> {
                try {
                    throw new Exception("Nu exista alta categorie de jucator");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
