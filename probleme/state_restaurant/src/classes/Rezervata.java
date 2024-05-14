package classes;

public class Rezervata implements State{
    public Rezervata() {
    }

    @Override
    public void setareStare(MasaDeRezervat masaDeRezervat) {
        masaDeRezervat.setStare(this);
    }
}
