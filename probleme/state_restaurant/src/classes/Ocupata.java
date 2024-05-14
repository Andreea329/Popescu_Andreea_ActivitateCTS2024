package classes;

public class Ocupata implements State{

    public Ocupata() {
    }

    @Override
    public void setareStare(MasaDeRezervat masaDeRezervat) {
        masaDeRezervat.setStare(this);
    }
}
