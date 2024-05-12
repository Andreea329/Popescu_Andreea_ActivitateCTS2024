package aplicatieFarmacie;

import common.IMedicament;

public class FarmacieMedicament implements IMedicament {
    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentele solicitate au fost vandute.");
    }
}
