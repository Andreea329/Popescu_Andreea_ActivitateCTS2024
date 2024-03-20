package prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{
    private Map<String,Double>solutii;  //cheia este solutia si valoarea cantitate
    private String name;

    public Reteta(Map<String, Double> solutii, String name) {
        this.solutii = solutii;
        this.name = name;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii =new HashMap<>(); //alocam spatiu
        for(String solutie: solutii.keySet()){
            this.solutii.put(solutie,solutii.get(solutie));  //put primeste cheia
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reteta() {
        name="Nou";
        solutii=null;
    }

    public RetetaAbstracta clone(){
        Reteta abstracta = new Reteta();   //ca sa evitam apelul constructorului cu parametrii
        abstracta.setSolutii(this.solutii);
        abstracta.setName(this.name);
        return abstracta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", name='" + name + '\'' +
                '}';
    }
}
