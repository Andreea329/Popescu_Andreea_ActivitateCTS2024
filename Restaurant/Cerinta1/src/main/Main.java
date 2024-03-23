package main;

import factory_method.Supa;
import factory_method.factory.FabricaSupaCiuperci;
import factory_method.factory.FabricaSupaLegume;
import factory_method.factory.FabricaSupaVita;
import factory_method.factory.IFabricaSupa;

public class Main {

    public static void prelucrareSupa(IFabricaSupa fabricaSupa, double gramaj, int cantitate, int nrPortiiVandute){
        Supa supa = fabricaSupa.creazaSupa(gramaj,cantitate,nrPortiiVandute);
        supa.afisatiDetaliiVanzari();
    }

    public static void main(String[] args) {
        IFabricaSupa fabricaSupaCiuperci =new FabricaSupaCiuperci();
        IFabricaSupa fabricaSupaLegume=new FabricaSupaLegume();
        IFabricaSupa fabricaSupaVita= new FabricaSupaVita();

        Supa supaCiuperci= fabricaSupaCiuperci.creazaSupa(120,12,30);
        Supa supaLegume=fabricaSupaLegume.creazaSupa(130,10,40);
        Supa supaVita= fabricaSupaVita.creazaSupa(120,17,10);

        supaLegume.afisatiDetaliiVanzari();
        supaCiuperci.afisatiDetaliiVanzari();
        supaVita.afisatiDetaliiVanzari();

        System.out.println();
        prelucrareSupa(fabricaSupaCiuperci,130,12,34);
    }
}