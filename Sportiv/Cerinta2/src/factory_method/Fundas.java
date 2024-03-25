package factory_method;

public class Fundas extends CategorieJucator{
    public Fundas(String nume, String echipa, int varsta) {
        super(nume, echipa, varsta);
    }
    @Override
    public void detaliiJucator() {
        System.out.println("Jucatorul "
                +this.getNume() + " are varsta de "
                +this.getVarsta()+" ani si joaca la echipa "
                +this.getEchipa());
    }
}
