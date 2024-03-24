package prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    private Map<String,Double> solutii; //denumire, cantitate

    public Reteta(Map<String, Double> solutii) {
        this.solutii = solutii;
    }

    public Reteta() {
        this.solutii=null;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii=new HashMap<>();
        for(String solutie: solutii.keySet()){
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    @Override
    public IReteta clone() {
        Reteta reteta= new Reteta();
        reteta.setSolutii(this.solutii);
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                '}';
    }
}
