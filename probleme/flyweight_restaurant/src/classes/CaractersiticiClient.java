package classes;

public class CaractersiticiClient {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public CaractersiticiClient(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    @Override
    public String toString() {
        return "CaractersiticiClient{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare='" + oraRezervare + '\'' +
                '}';
    }
}
