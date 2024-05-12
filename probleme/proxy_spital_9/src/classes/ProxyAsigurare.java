package classes;

public class ProxyAsigurare implements  Internare{
    @Override
    public void interneaza(Persoana persoana) {
        System.out.println("Persoana "+persoana.getNume()+", "+(persoana.isAreAsigurare()?"a":"nu")+" fost internata.");
    }
}
