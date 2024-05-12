package main;

import aplicatieFarmacie.FarmacieMedicament;
import aplicatieFarmacie.FarmacieMedicamentAdapter;
import aplicatieSpital.SpitalMedicament;
import common.IMedicament;

public class Main {
    public static void main(String[] args) {
        IMedicament spitalMedicamente=new SpitalMedicament();
        IMedicament farmacieMedicamentAdapter=new FarmacieMedicamentAdapter(new FarmacieMedicament());

        spitalMedicamente.cumparaMedicament();
        System.out.println(" ");
        farmacieMedicamentAdapter.cumparaMedicament();
    }
}