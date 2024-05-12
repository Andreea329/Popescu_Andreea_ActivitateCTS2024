package classes;

public class PlataCash implements Plata{

    @Override
    public void plateste(String nume) {
        System.out.println("Persana "+nume+" alege sa platesca cash.");
    }
}
