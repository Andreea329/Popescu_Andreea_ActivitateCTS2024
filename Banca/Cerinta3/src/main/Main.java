package main;

import builder.SetariCont;
import builder.SetariContBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SetariCont cont1= new SetariContBuilder()
                .setContSalariu(true)
                .setCardAtasat(true)
                .setInternetBanking(true)
                .build();

        SetariCont cont2= new SetariContBuilder()
                .setContSalariu(false)
                .setCardAtasat(true)
                .setInternetBanking(true)
                .build();

        SetariCont cont3= new SetariContBuilder()
                .setContSalariu(true)
                .setCardAtasat(true)
                .setInternetBanking(false)
                .build();

        SetariCont cont4= new SetariContBuilder()
                .setContSalariu(false)
                .setCardAtasat(false)
                .setInternetBanking(false)
                .build();

        List<SetariCont> listaConturi=new ArrayList<>();
        listaConturi.add(cont1);
        listaConturi.add(cont2);
        listaConturi.add(cont3);
        listaConturi.add(cont4);

        for (SetariCont cont: listaConturi){
            System.out.println(cont.toString());
        }

    }
}