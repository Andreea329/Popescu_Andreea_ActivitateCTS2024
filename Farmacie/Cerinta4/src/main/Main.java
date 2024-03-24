package main;

import prototype.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Double> listaRetete=new HashMap<>();
        listaRetete.put("paracetamol",30.5);
        listaRetete.put("crema de galbenele",50.0);
        listaRetete.put("antinevralgic",20.5);

        Reteta reteta=new Reteta(listaRetete);
        System.out.println(reteta.toString());

        Reteta retetaClona= (Reteta) reteta.clone();
        System.out.println(retetaClona.toString());

    }
}