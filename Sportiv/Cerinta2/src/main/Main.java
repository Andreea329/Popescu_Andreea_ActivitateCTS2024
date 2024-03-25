package main;

import factory_method.CategorieJucator;
import factory_method.factory.FabricaAtacant;
import factory_method.factory.FabricaFundas;
import factory_method.factory.FabricaJucator;
import factory_method.factory.FabricaPortar;

public class Main {
    public static void main(String[] args) {

        FabricaJucator fabricaPortar= new FabricaPortar();
        FabricaJucator fabricaFundas= new FabricaFundas();
        FabricaJucator fabricaAtacant=new FabricaAtacant();

        CategorieJucator portar= fabricaPortar.creazaJucator("Marian Aioanei","FC Rapid Bucuresti",23);
        CategorieJucator fundas= fabricaFundas.creazaJucator("Cristian Sapunaru","FC Rapid Bucuresti",40);
        CategorieJucator atacant= fabricaAtacant.creazaJucator("Mihai Popescu","Farul Constanta",26);

        portar.detaliiJucator();
        fundas.detaliiJucator();
        atacant.detaliiJucator();
    }
}