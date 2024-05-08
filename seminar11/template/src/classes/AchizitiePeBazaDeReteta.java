package classes;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente{
    Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul "+ reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for(String medicament: reteta.getListaMedicamente()){
            if(!(super.stocuri.containsKey(medicament))) {
                System.out.println("Medicamentul " + medicament + " nu este in stoc");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele pentru reteta " + reteta.getNrReteta() + " sunt aduse.");
        for(String medicament: reteta.getListaMedicamente()){
           int stocDisponibil= super.stocuri.get(medicament);
           stocDisponibil--;

           super.stocuri.replace(medicament,stocDisponibil);
        }
        //parcurgem mapul si in cazul in care in medicament avem valoarea mai <= 0 trebuie scos medicamentul
    }

    @Override
    public void incaseaza() {
        System.out.println("Au fost incasati banii pentru reteta "+ reteta.getNrReteta());
    }

    @Override
    public void emitereBon() {
        System.out.println("Bonul pentru reteta "+ reteta.getNrReteta() +" a fost emis.");
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("Reteta "+ reteta.getNrReteta() +" a fost respinsa.");
    }
}
