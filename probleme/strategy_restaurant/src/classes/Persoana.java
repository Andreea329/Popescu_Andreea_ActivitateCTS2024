package classes;

public class Persoana {
    private IPlata plata;

    public Persoana(IPlata plata) {
        this.plata = plata;
    }

    public Persoana() {
        this.plata=new PlataCash();
    }

    public IPlata getPlata() {
        return plata;
    }

    public void setPlata(IPlata plata) {
        this.plata = plata;
    }

    public void plataPersoan(String nume){
        plata.plateste(nume);
    }
}
