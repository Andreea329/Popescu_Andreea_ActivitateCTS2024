package SimpleFactory.classes.factory;

import SimpleFactory.classes.*;

public class FabricaPersonal {

    public PersonalSiptal createPersonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        switch (tipPersonal){
            case MEDIC :
                Medic medic=new Medic(nume,salariu);
                return medic;
            case ASISTENT:
                Asistent asistent=new Asistent(nume,salariu);
                return asistent;
            case BANCARDIER:
                Bracardier brancardier=new Bracardier(nume, salariu);
                return  brancardier;
            case INFIRMIER:
                Infirmier infirmier =new Infirmier(nume, salariu);
                return  infirmier;
            default: throw new Exception("Tipul nu exista!");
        }

    }
}
