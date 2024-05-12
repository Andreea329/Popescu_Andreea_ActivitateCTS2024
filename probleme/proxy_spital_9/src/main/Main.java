package main;

import classes.Internare;
import classes.InternarePersoana;
import classes.Persoana;
import classes.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        InternarePersoana internarePersoana= new InternarePersoana();
        Persoana persoana=new Persoana("Ana",true);
        Persoana persoana2=new Persoana("Mara",false);

        internarePersoana.interneaza(persoana);
        internarePersoana.interneaza(persoana2);

        System.out.println(" ");

        Internare proxyInternare=new ProxyAsigurare();
        proxyInternare.interneaza(persoana);
        proxyInternare.interneaza(persoana2);
    }
}