package aplicatieSpital;

import common.IMedicament;

public class SpitalMedicament implements IMedicament {
    @Override
    public void cumparaMedicament() {
        achizitioneazaMedicament();
    }
    public void achizitioneazaMedicament(){
        System.out.println("Se solicita medicamentele.");
        printeazaReteta();
    }
    public void printeazaReteta(){
        System.out.println("Verificarea retetei in cus...");
    }
}
