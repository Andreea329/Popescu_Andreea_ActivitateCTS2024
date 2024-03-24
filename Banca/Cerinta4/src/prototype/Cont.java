package prototype;

public class Cont implements ICont{

    private String nume;
    private String email;
    private double sumaDebit;

    public Cont(String nume, String email, double sumaDebit) {
        this.nume = nume;
        this.email = email;
        this.sumaDebit = sumaDebit;
    }

    public Cont() {
        this.nume="";
        this.email="";
        this.sumaDebit=0.0;
    }


    @Override
    public ICont clone() {
        Cont cont=new Cont();
        cont.setNume(this.nume);
        cont.setEmail(this.getEmail());
        cont.setSumaDebit(this.getSumaDebit());
        return cont;
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

    public double getSumaDebit() {
        return sumaDebit;
    }

    public void setSumaDebit(double sumaDebit) {
        this.sumaDebit = sumaDebit;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", sumaDebit=" + sumaDebit +
                '}';
    }
}
