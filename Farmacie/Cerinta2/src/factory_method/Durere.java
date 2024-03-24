package factory_method;

public class Durere extends CategorieMedicamente{
    public Durere(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        super(nume, gramaj, pret, nrAdministrariPeZi);
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Medicamentul pentru categoria durere " + this.getNume()
                + " este vandut la pretul de " + this.getPret()
                + ", pentru un gramaj de " + this.getGramaj()
                + " si se administreaza de " + this.getNrAdministrariPeZi() + " pe zi.");
    }
}
