package classes;

public class Client implements Flyweight{
    private String nume;
    private String nrTel;
    private String adresaMail;

    public Client(String nume, String nrTel, String adresaMail) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.adresaMail = adresaMail;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTel() {
        return nrTel;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTel='" + nrTel + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                '}';
    }

    @Override
    public void rezerva(CaractersiticiClient caractersiticiClient) {
        System.out.println(this.toString()+" "+caractersiticiClient.toString());
    }

}
