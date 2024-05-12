package classes;

public class Pacient {
    private String nume;
    private String stare;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
}
