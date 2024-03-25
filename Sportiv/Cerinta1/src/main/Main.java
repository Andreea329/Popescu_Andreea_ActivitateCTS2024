package main;

import simple_factory.CategorieJucator;
import simple_factory.factory.FabricaJucatori;
import simple_factory.factory.TipJucator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        FabricaJucatori fabricaJucatori=new FabricaJucatori();

        try {
            CategorieJucator portar= fabricaJucatori.creazaJucator(TipJucator.PORTAR,"Marian Aioanei","FC Rapid Bucuresti",23);
            CategorieJucator fundas= fabricaJucatori.creazaJucator(TipJucator.FUNDAS,"Cristian Sapunaru","FC Rapid Bucuresti",40);
            CategorieJucator atacant=fabricaJucatori.creazaJucator(TipJucator.ATACANT,"Daniel Birligea","CFR Cluj",25);
            CategorieJucator fundas2= fabricaJucatori.creazaJucator(TipJucator.FUNDAS,"Mihai Popescu","Farul Constanta",26);

           List<CategorieJucator>listaJucatori=new ArrayList<>();
            listaJucatori.add(portar);
            listaJucatori.add(fundas);
            listaJucatori.add(atacant);
            listaJucatori.add(fundas2);

            for(CategorieJucator jucator:listaJucatori){
                jucator.detaliiJucator();
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}