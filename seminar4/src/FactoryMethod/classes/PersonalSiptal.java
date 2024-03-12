package FactoryMethod.classes;

public abstract class PersonalSiptal {
    private String nume;
    private int salariu;

    public PersonalSiptal(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalSiptal{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public abstract void  afisareDetalii();
}
