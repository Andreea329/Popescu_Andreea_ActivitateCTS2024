package factory_method;

public abstract class CategorieClienti {

    private String nume;
    private double valoareCredit;
    private String tipCredit;

    public CategorieClienti(String nume, double valoareCredit, String tipCredit) {
        this.nume = nume;
        this.valoareCredit = valoareCredit;
        this.tipCredit = tipCredit;
    }

    public String getNume() {
        return nume;
    }

    public double getValoareCredit() {
        return valoareCredit;
    }

    public String getTipCredit() {
        return tipCredit;
    }

    public abstract void detaliiClient();
}
