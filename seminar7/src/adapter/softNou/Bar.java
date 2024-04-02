package adapter.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {

    private List<Bautura> listaBauturi;

    public Bar() {
        this.listaBauturi=new ArrayList<>();
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }
    public void tiparireNotaDePlata(){
        float total=0;
        for(Bautura bautura: listaBauturi){
            System.out.println("Bautura este: " + bautura.getDenumire() + " si are gradul de alcool " + bautura.getGradAlcol());
            total +=bautura.getPret();
        }
        System.out.println("Totalul bauturilor este de: " + total);
    }
}
