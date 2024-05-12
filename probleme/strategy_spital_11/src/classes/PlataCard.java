package classes;

public class PlataCard implements Plata{

    @Override
    public void plateste(String nume) {
        System.out.println("Persoana "+nume+" alege sa platesca cu cardul.");
    }
}
