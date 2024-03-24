package main;

import factory_method.CategorieMedicamente;
import factory_method.factory.FabricaMedicamente;
import factory_method.factory.FabricaMedicamenteDurere;
import factory_method.factory.FabricaMedicamenteRaceala;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FabricaMedicamente fabricaMedicamenteBody= new FabricaMedicamenteDurere();
        FabricaMedicamente fabricaMedicamenteDurere= new FabricaMedicamenteRaceala();
        FabricaMedicamente fabricaMedicamenteRaceala= new FabricaMedicamenteRaceala();


        List<CategorieMedicamente> listaMedicamente=new ArrayList<>();
        listaMedicamente.add(fabricaMedicamenteBody.creazaMedicament("Calciu",30,50,2));
        listaMedicamente.add(fabricaMedicamenteDurere.creazaMedicament("Paracetamol",30,20,1));
        listaMedicamente.add( fabricaMedicamenteRaceala.creazaMedicament("Nurofen",50,25,4));

        for(CategorieMedicamente medicament: listaMedicamente){
            medicament.detaliiMedicament();
        }

    }
}