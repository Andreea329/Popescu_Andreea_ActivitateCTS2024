package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet=new VanzareBilet("Rapid-Sepsi",80);
        Persoana persoana=new Persoana("Andreea Popescu",12,"feminin");
        Persoana persoana2=new Persoana("Andrei Popa",21,"masculin");

        vanzareBilet.vanzare(persoana);
        vanzareBilet.vanzare(persoana2);

        Vanzare proxyVarsta=new ProxyVarsta(vanzareBilet);
        System.out.println(" ");
        proxyVarsta.vanzare(persoana);
        proxyVarsta.vanzare(persoana2);

        System.out.println(" ");
        Vanzare proxyGen=new ProxyGen(proxyVarsta,"feminin"); //doua conitii
        proxyGen.vanzare(persoana);
        proxyGen.vanzare(persoana2);



    }
}