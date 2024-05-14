package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<String,Flyweight>rezervari;

    public Fabrica() {
        this.rezervari=new HashMap<String ,Flyweight>();
    }
    public Flyweight getClienti(String nume,String nrTelefon, String adresaEmail){
        String cheie=nume+"_"+nrTelefon+"_"+adresaEmail;
        Flyweight flyweight=rezervari.get(cheie);
        if(flyweight==null){
            flyweight=new Client(nume,nrTelefon,adresaEmail);
            rezervari.put(cheie,flyweight);
        }
        return flyweight;
    }
}
