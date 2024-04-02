package adapter.softNou;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.ISoftBucatarie;
import adapter.softVechi.Produs;

    public class AdapterComandaBarBucatarie extends Bar implements ISoftBucatarie {
    @Override
    public void printareBon() {
        super.tiparireNotaDePlata();
    }

    @Override
    public void adaugareProdus(Produs p) {
        //nu este recomdat, trebuia adapter de clasa
        Bautura b= new Bautura(p.getPret(), p.getDenumire(), 0);
        super.adaugaBautura(b);
    }
}
