package simple_factory;

public abstract class CategoriiCredite {
    private double suma;
    private String titularCredit;
    private int nrAni;

    public CategoriiCredite(double suma, String titularCredit, int nrAni) {
        this.suma = suma;
        this.titularCredit = titularCredit;
        this.nrAni = nrAni;
    }

    public double getSuma() {
        return suma;
    }

    public String getTitularCredit() {
        return titularCredit;
    }

    public int getNrAni() {
        return nrAni;
    }

    public abstract void detaliiCredit();
}
