package prototype;

public class ContClient{

    private String nume;
    private String nrTelefon;
    private String email;

    public ContClient(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
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
        return "Clientul " +
                 nume + ' ' +
                " poate fi gasit la urmatoarele date de contact: " + ' ' + "Număr de telefon: " + nrTelefon + ' ' +
                ", email= " + email + ' ';

    }


}
