package classes;

public abstract class StructuraAbstracta {
    private String nume;
    public abstract void adaugaStructura(StructuraAbstracta structuraAbstracta);
    public abstract void afiseazaDetalii(String indentare);

    public StructuraAbstracta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
