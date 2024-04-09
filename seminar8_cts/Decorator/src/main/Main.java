package main;

import decorator.AplicatieMobila;
import decorator.Decorator;
import decorator.AplicatieMobila;
import decorator.WebSite;
import spital.Diagnostic;
import spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {

        DiagnosticAbstract diagnostic = new Diagnostic("raceala","tuse",false);
        diagnostic.printeazaDiagnostic();

        System.out.println(" ");
        Decorator decorator=new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        System.out.println(" ");
        Decorator website= new WebSite(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnostic();
    }
}