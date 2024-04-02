package adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class SoftBucatarie implements ISoftBucatarie {

    private List<Produs>listaProduse;

    public SoftBucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public void adaugareProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    @Override
    public void printareBon() {
        float total=0;
        for(Produs produs:listaProduse){
            System.out.println("Produseul este: " + produs.getDenumire() );

             total += produs.getPret();
        }
        System.out.println("Totalul produselor este " + total );
    }
}
