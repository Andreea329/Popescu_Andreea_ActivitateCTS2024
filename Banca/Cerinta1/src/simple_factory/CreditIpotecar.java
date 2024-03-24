package simple_factory;

public class CreditIpotecar extends CategoriiCredite{
    public CreditIpotecar(double suma, String titularCredit, int nrAni) {
        super(suma, titularCredit, nrAni);
    }



    @Override
    public void detaliiCredit() {
        System.out.println("Creditul impotecar " + "s-a facut pe numele domnului/doamnei " + this.getTitularCredit()
        + " si este in valoare de " + this.getSuma() + " lei, pe o durata de " + this.getNrAni() + " ani. ");
    }
}
