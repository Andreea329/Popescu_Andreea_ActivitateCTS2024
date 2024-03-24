package factory_method;

public class PersoanaJuridica extends CategorieClienti{
    public PersoanaJuridica(String nume, double valoareCredit, String tipCredit) {
        super(nume, valoareCredit, tipCredit);
    }

    @Override
    public void detaliiClient() {
        System.out.println("Clientul/a" + " " + this.getNume()
                + " " + "a facut un credit de" + " " +this.getTipCredit() + " " + "in valoare de" + " " + this.getValoareCredit() );
    }
}
