package simple_factory;

public abstract class CategorieMedicamente {

    private String nume;
    private double gramaj;
    private int pret;
    private int nrAdministrariPeZi;

    public CategorieMedicamente(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        this.nume = nume;
        this.gramaj = gramaj;
        this.pret = pret;
        this.nrAdministrariPeZi = nrAdministrariPeZi;
    }

    public String getNume() {
        return nume;
    }

    public double getGramaj() {
        return gramaj;
    }

    public int getPret() {
        return pret;
    }

    public int getNrAdministrariPeZi() {
        return nrAdministrariPeZi;
    }

    public abstract void detaliiMedicament();
}
