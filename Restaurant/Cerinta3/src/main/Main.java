package main;

import simple_factory.Supa;
import simple_factory.factory.FabricaSupa;
import simple_factory.factory.TipSupa;

public class Main {
    public static void main(String[] args) {

        FabricaSupa fabricaSupa=new FabricaSupa();

        try {

            Supa supaCiuperci= fabricaSupa.creazaSupa(TipSupa.CIUPERCI,120,12,40);
            Supa supaVita= fabricaSupa.creazaSupa(TipSupa.VITA,120,15,30);
            Supa supaPui= fabricaSupa.creazaSupa(TipSupa.PUI,123,14,40);
            Supa supaLegume= fabricaSupa.creazaSupa(TipSupa.LEGUME,130,12,35);

            supaLegume.afisatiDetaliiVanzari();
            supaPui.afisatiDetaliiVanzari();
            supaCiuperci.afisatiDetaliiVanzari();
            supaVita.afisatiDetaliiVanzari();

        }catch (Exception e){
            throw  new RuntimeException(e);
        }

    }
}