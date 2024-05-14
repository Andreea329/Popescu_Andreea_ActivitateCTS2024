package classes;

public class Libera implements State {
    public Libera() {
    }

    @Override
    public void setareStare(MasaDeRezervat masaDeRezervat) {
        masaDeRezervat.setStare(this);
    }
}
