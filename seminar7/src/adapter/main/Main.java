package adapter.main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.AdapterBauturaProdus;
import adapter.softNou.AdapterComandaBarBucatarie;
import adapter.softVechi.Produs;
import adapter.softVechi.SoftBucatarie;

public class Main {
    public static void platesteConsumatia(SoftBucatarie comanda){
       comanda.printareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie= new SoftBucatarie();

        Produs produs=new Produs("Pizza",52);
        Produs produs1=new Produs("Paste",45);
        bucatarie.adaugareProdus(produs);
        bucatarie.adaugareProdus(produs1);


        platesteConsumatia(bucatarie);

        Bar bar=new Bar();
        bar.adaugaBautura(new Bautura(12,"Cola",0));
        bar.adaugaBautura(new Bautura(30,"Mojito",10));

        AdapterComandaBarBucatarie barAdapter=new AdapterComandaBarBucatarie();
        barAdapter.adaugaBautura(new Bautura(10,"Fanta",0));
        barAdapter.adaugaBautura(new Bautura(11,"Pepsi",0));
        barAdapter.adaugaBautura(new Bautura(12,"Mrinda",0));

        Bautura bautura=new Bautura(8,"apa",0);
        AdapterBauturaProdus produs2=new AdapterBauturaProdus(bautura);
        barAdapter.adaugareProdus(produs2);

        barAdapter.tiparireNotaDePlata();

    }
}

//adapter-nivel intermediar