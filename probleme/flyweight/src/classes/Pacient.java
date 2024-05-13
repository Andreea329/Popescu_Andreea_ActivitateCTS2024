package classes;

public class Pacient implements Flyweight {
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void prezintaInformatii(CaracterisSalon caracterisSalon) {
        System.out.println(this.toString()+" "+caracterisSalon.toString());
    }
}
