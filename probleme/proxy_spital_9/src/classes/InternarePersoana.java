package classes;

public class InternarePersoana implements Internare{
    @Override
    public void interneaza(Persoana persoana) {
        System.out.println("Perosna "+persoana.getNume()+" solicita internarea.");
    }
}
