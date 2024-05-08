package main;

import classes.*;

import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1,suporter2,suporter3;
        suporter1="GigelVIP";
        suporter2="GigelPeluza";
        suporter3="GigelTribuna";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);
    }
}