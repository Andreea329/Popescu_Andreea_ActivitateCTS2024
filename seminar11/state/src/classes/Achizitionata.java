package classes;

public class Achizitionata implements State{

    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this);
    }
}
