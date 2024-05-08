package classes;

public class Emisa implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this); //this pentru ca obiectul este deja creat
    }
}
