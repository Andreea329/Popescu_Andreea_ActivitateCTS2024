package classes;

public class Items extends StructuraAbstracta {

    public Items(String nume) {
        super(nume);
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println(indentare + "Item: " + getNume());
    }
}
