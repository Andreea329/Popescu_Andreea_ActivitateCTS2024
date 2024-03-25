package factory_method;

public abstract class CategorieJucator {
    private String nume;
    private String echipa;
    private int varsta;


    public CategorieJucator(String nume, String echipa, int varsta) {
        this.nume = nume;
        this.echipa = echipa;
        this.varsta = varsta;

    }

    public String getNume() {
        return nume;
    }

    public String getEchipa() {
        return echipa;
    }

    public int getVarsta() {
        return varsta;
    }


    public abstract void detaliiJucator();
}
