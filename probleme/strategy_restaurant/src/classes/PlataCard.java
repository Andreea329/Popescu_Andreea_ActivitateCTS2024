package classes;

public class PlataCard implements IPlata{
    @Override
    public void plateste(String nume) {
        System.out.println("Persoana "+nume+" alege sa platsca cu cardul.");
    }
}
