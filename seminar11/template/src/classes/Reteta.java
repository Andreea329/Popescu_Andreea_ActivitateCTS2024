package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    int nrReteta;
    private List<String> listaMedicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        this.listaMedicamente=new ArrayList<>();
    }

    public void adaugaMedicamente(String mediecamente) {
        listaMedicamente.add(mediecamente);
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }
}
