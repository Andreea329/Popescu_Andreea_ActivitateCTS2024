package factory_method;

public abstract class Supa {
    private double gramaj;
    private int pret;
    private int nrPortiiVandute;

    public Supa(double gramaj, int pret, int nrPortiiVandute) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.nrPortiiVandute = nrPortiiVandute;
    }

    public double getGramaj() {
        return gramaj;
    }

    public int getPret() {
        return pret;
    }

    public int getNrPortiiVandute() {
        return nrPortiiVandute;
    }

    public abstract void afisatiDetaliiVanzari();
}
