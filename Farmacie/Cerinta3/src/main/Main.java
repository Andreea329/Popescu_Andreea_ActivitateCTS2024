package main;

import builder.ClientFarmacie;
import builder.ClientFarmacieBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClientFarmacie clientFarmacie= new ClientFarmacieBuilder()
                .setNumarPungi(2)
                .setPlataCuCard(true)
                .setCardFidelitate(false)
                .setCotaTVA(0)
                .build();

        ClientFarmacie clientFarmacie2=new ClientFarmacieBuilder()
                .setNumarPungi(0)
                .setPlataCuCard(true)
                .setCardFidelitate(true)
                .setCotaTVA(0)
                .build();
        ClientFarmacie clientFarmacie3=new ClientFarmacieBuilder()
                .setNumarPungi(1)
                .setPlataCuCard(true)
                .setCardFidelitate(true)
                .setCotaTVA(0.19)
                .build();

        ClientFarmacie clientFarmacie4=new ClientFarmacieBuilder()
                .setNumarPungi(1)
                .setPlataCuCard(false)
                .setCardFidelitate(false)
                .setCotaTVA(0)
                .build();

        List<ClientFarmacie>clienti=new ArrayList<>();
        clienti.add(clientFarmacie);
        clienti.add(clientFarmacie2);
        clienti.add(clientFarmacie3);
        clienti.add(clientFarmacie4);

        for (ClientFarmacie client: clienti){
            System.out.println(client.toString());
        }
    }
}