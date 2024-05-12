package classes;

public class Persoana {

    private Plata plata;

    public Persoana(Plata plata) {

        this.plata = plata;
    }

    public Persoana() {
        this.plata=new PlataCash();
    }

    public Plata getPlata() {
        return plata;
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }
    public void plataPersoan(String nume){
        plata.plateste(nume);
    }
}
