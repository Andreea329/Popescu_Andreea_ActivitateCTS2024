package classes;

public class Persoana {
    private String nume;
    private int nrPersoaneLaMasa;
    private String nrTelefon;

    public Persoana(String nume, int nrPersoaneLaMasa, String nrTelefon) {
        this.nume = nume;
        this.nrPersoaneLaMasa = nrPersoaneLaMasa;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoaneLaMasa() {
        return nrPersoaneLaMasa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }
}
