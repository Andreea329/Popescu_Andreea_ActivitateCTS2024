package classes;

public class CaracterisSalon {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public CaracterisSalon(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "CaracterisSalon{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }
}
