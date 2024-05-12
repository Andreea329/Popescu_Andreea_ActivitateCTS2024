package observer;

public class Pacient implements Observer{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void primesteNotificarea(String mesaj) {
        System.out.println("Pacientul/a "+nume+" a primit urmatoarea notificare: "+mesaj);
    }
}
