package classes;

public class PlataCash implements IPlata{


    @Override
    public void plateste(String nume) {
        System.out.println("Persoana "+nume+" alege sa platesca cu cardul.");
    }
}
