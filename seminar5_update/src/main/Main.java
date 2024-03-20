package main;

import builder.Pacient;
import builder.PacientBuilder;
import prototype.Reteta;
import prototype.RetetaAbstracta;
import prototype.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setHalatInterior(false).setMicDejun(false).setPapuciCamera(false).setPatRabatabil(false).build();
        System.out.println(pacient.toString());

        builder_v3.Pacient.PacientBuilder builder = new builder_v3.Pacient.PacientBuilder();
        builder_v3.Pacient pacient_v2 = builder.setHalatInterior(true).setMicDejun(true).setPatRabatabil(false).setPapuciCamera(false).build();
        System.out.println(pacient_v2.toString());


        Map<String, Double> solutii = new HashMap<>();
        solutii.put("paracetamol", 500.0);
        solutii.put("aspirina", 30.0);
        solutii.put("antinevralgic", 20.0);

        Reteta prototip = new Reteta(solutii, "Paracetamol");
        System.out.println(prototip.toString());

        RetetaAbstracta reteta2 = prototip.clone();
        System.out.println(reteta2.toString());

        RetetaCrema prototipCrema = new RetetaCrema(25, "Crema de galbenele");
        System.out.println(prototipCrema.toString());

        RetetaAbstracta reteta3 = prototipCrema.clone();
        System.out.println(reteta3.toString());
    }
}