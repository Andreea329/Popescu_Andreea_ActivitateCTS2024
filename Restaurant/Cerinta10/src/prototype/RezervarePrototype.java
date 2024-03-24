package prototype;

public class RezervarePrototype implements IRezervare {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    private ContClient client;

    public RezervarePrototype(int nrMasa, int nrPersoane, String oraRezervare, ContClient client) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
        this.client = client;
    }

    public RezervarePrototype() {
        this.nrMasa=0;
        this.nrPersoane=0;
        this.oraRezervare=" ";
        this.client=null;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public void setClient(ContClient client) {
        this.client = client;
    }

    @Override
    public IRezervare clone() {
        RezervarePrototype rezervarePrototype= new RezervarePrototype();
        rezervarePrototype.setNrMasa(this.nrMasa);
        rezervarePrototype.setNrPersoane(this.nrPersoane);
        rezervarePrototype.setOraRezervare(this.oraRezervare);
        rezervarePrototype.setClient(this.client);
        return rezervarePrototype;
    }

    @Override
    public String toString() {
        return "RezervarePrototype{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare= " + oraRezervare + ' ' +
                ", client=" + client +
                '}';
    }
}
