package factory_method;

public class Portar extends CategorieJucator{
    public Portar(String nume, String echipa, int varsta) {
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
