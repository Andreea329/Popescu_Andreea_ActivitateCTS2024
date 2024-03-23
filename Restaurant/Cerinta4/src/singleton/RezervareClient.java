package singleton;

import java.util.HashMap;
import java.util.Map;

public class RezervareClient {

    private static RezervareClient instanta=null;
    private Map<Integer,ContClient> listaClienti=new HashMap<>();

    private RezervareClient() {
    }

    public static synchronized RezervareClient getInstance(){
        if(instanta == null){
            instanta=new RezervareClient();
        }
        return instanta;
    }

    public Map<Integer, ContClient> getListaClienti() {
        return listaClienti;
    }

    public void inregistrareClient(ContClient contClient){
        if(listaClienti.containsKey(contClient.getId())){
            System.out.println("Clientul " + contClient.getNume() + " cu id-ul " + contClient.getId() + " este inregistrat deja in baza de date a restaurantului.");
        } else {
            listaClienti.put(contClient.getId(),contClient);
            System.out.println("Clientul " + contClient.getNume() + " cu id-ul " + contClient.getId() + " nu este inregistrat deja in baza de date a restaurantului.");
        }
    }
}
