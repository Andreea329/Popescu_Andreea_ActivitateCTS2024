package SimpleFactory.classes;

public class Medic  extends PersonalSiptal {

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul "+getNume() + " are salariul " + getSalariu());
    }
}

