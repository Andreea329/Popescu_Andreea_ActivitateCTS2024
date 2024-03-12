package SimpleFactory.classes;

public class Bracardier extends PersonalSiptal {

    public Bracardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
       System.out.println("Bracardierul "+getNume() + " are salariul " + getSalariu());
    }
}

