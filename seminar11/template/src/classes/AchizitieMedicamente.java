package classes;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {

    Map<String,Integer> stocuri;

    public AchizitieMedicamente() {
        this.stocuri=new HashMap<>();
        stocuri.put("nurofen",1);
        stocuri.put("paracetamol",2);
        stocuri.put("nospa",3);
        stocuri.put("vitamina c",4);
    }

    public final void achizitioneazaMedicament(){
        primesteReteta();

        if( verificaStoc()==true){

            aducereMedicamente();
            incaseaza();
            emitereBon();

        }else {
            respingeAchizitie();
        }
    }

    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emitereBon();
    public abstract void respingeAchizitie();
}
