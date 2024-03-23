package singleton;

public class ContClient {

    private int id;
    private String nume;
    private String nrTelefon;
    private String email;

    public ContClient(int id, String nume, String nrTelefon, String email) {
        this.id = id;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
