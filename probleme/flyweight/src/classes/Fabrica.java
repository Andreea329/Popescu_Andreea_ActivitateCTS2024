package classes;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<String,Flyweight>pacienti;

    public Fabrica() {
        this.pacienti=new HashMap<String ,Flyweight>();
    }

    public Flyweight getPacienti(String nume, String nrTelefon,String adresa ){
        String cheie=nume+"_"+nrTelefon+"_"+adresa;
        Flyweight flyweight= pacienti.get(cheie);
        if(flyweight == null){
            flyweight=new Pacient(nume,nrTelefon,adresa);
            pacienti.put(cheie,flyweight);
        }
        return flyweight;
    }
}
