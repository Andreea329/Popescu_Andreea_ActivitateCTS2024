package classes;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;

    public Subsectiune(String nume) {
        super(nume);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        structuri.add(structuraAbstracta);
    }


    public StructuraAbstracta getStructura(int index) {
        if (index >= 0 && index < this.structuri.size()) {
            return this.structuri.get(index);
        } else {
            throw new IllegalArgumentException("Indexul " + index + " este incorect.");
        }
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println(indentare + "Subsectiune: " + getNume());
        for (StructuraAbstracta structura : structuri) {
            structura.afiseazaDetalii(indentare + "  ");
        }
    }
}
