package observer;

public class Clienti implements Observer{
    private String nume;

    public Clienti(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteOferta(String mesaj) {
        System.out.println(nume+" ai primit urmatoarea notificare: "+mesaj);
    }
}
