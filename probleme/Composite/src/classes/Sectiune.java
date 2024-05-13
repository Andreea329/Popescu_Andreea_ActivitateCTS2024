package classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraAbstracta {
    private List<StructuraAbstracta>structuri;

    public Sectiune(String nume) {
        super(nume);
        this.structuri=new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        structuri.add(structuraAbstracta);
    }

    public StructuraAbstracta getStructura(int index){
        if(index>=0 && index<this.structuri.size()){
            return this.structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDetalii(String identare) {
        System.out.println(" Sectiunea "+super.getNume()+" are urmatoarele componente: ");
        for(StructuraAbstracta structuraAbstracta: structuri){
            structuraAbstracta.afiseazaDetalii(identare+" ");
        }
    }
}
