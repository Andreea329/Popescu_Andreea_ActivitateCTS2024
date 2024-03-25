package prototype;

public class ContClient implements ICont{
    private boolean abonament;
    private String nume;
    private String email;

    public ContClient(boolean abonament, String nume, String email) {
        this.abonament = abonament;
        this.nume = nume;
        this.email = email;
    }

    public ContClient() {
        this.abonament=false;
        this.nume=" ";
        this.email=" ";
    }

    public boolean isAbonament() {
        return abonament;
    }

    public void setAbonament(boolean abonament) {
        this.abonament = abonament;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ICont clone() {
        ContClient contClient=new ContClient();
        contClient.setAbonament(this.abonament);
        contClient.setNume(this.nume);
        contClient.setEmail(this.email);
        return contClient;
    }

    @Override
    public void afisareInformatii() {
        System.out.println("Spectatorul " + this.nume+" are adresa de email "+ this.email + ". Are abonament? "+this.abonament);
    }
}
