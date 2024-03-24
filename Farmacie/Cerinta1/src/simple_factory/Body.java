package simple_factory;

public class Body extends CategorieMedicamente{
    public Body(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        super(nume, gramaj, pret, nrAdministrariPeZi);
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Medicamentul pentru categoria body " + this.getNume()
                + " este vandut la pretul de " + this.getPret()
                + ", pentru un gramaj de " + this.getGramaj()
                + " si se administreaza de " + this.getNrAdministrariPeZi() + " pe zi.");
    }
}
