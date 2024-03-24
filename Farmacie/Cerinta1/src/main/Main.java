package main;

import simple_factory.CategorieMedicamente;
import simple_factory.factory.FabricaMedicamente;
import simple_factory.factory.TipMedicament;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaMedicamente=new FabricaMedicamente();

        try {
            CategorieMedicamente medicamentBody= fabricaMedicamente.creazaMedicamente(TipMedicament.BODY,"Magneziu",30,20,2);
            CategorieMedicamente medicamentDurere=fabricaMedicamente.creazaMedicamente(TipMedicament.DURERE,"Nospa",20,20,3);
            CategorieMedicamente medicamentRaceala=fabricaMedicamente.creazaMedicamente(TipMedicament.RACEALA,"Parasinus",40,25,3);

       //medicamentBody.detaliiMedicament();

            List<CategorieMedicamente>listaMedicamente=new ArrayList<>();
            listaMedicamente.add(medicamentBody);
            listaMedicamente.add(medicamentDurere);
            listaMedicamente.add(medicamentRaceala);

            for(CategorieMedicamente categorie: listaMedicamente){
                categorie.detaliiMedicament();
            }


        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}