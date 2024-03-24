package simple_factory;

public class CreditNevPersonale extends CategoriiCredite{
    public CreditNevPersonale(double suma, String titularCredit, int nrAni) {
        super(suma, titularCredit, nrAni);
    }

    @Override
    public void detaliiCredit() {
        System.out.println("Creditul de nevoi personale " + "s-a facut pe numele domnului/doamnei " + this.getTitularCredit()
                + " si este in valoare de " + this.getSuma() + " lei, pe o durata de " + this.getNrAni() + " ani. ");
    }

}
