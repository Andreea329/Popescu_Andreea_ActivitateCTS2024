package SimpleFactory.classes;

public class Asistent  extends PersonalSiptal {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }


    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul "+getNume() + " are salariul " + getSalariu());
    }
}
