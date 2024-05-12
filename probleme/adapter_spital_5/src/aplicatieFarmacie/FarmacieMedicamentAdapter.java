package aplicatieFarmacie;

import common.IMedicament;

public class FarmacieMedicamentAdapter implements IMedicament {
    FarmacieMedicament farmacieMedicament;

    public FarmacieMedicamentAdapter(FarmacieMedicament farmacieMedicament) {
        this.farmacieMedicament = farmacieMedicament;
    }

    @Override
    public void cumparaMedicament() {
        farmacieMedicament.cumparaMedicament();
    }
}
