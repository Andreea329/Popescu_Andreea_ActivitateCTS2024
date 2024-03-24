package factory_method;

public class Raceala extends CategorieMedicamente{
    public Raceala(String nume, double gramaj, int pret, int nrAdministrariPeZi) {
        super(nume, gramaj, pret, nrAdministrariPeZi);
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Medicamentul pentru categoria recaeala " + this.getNume()
                + " este vandut la pretul de " + this.getPret()
                + ", pentru un gramaj de " + this.getGramaj()
                + " si se administreaza de " + this.getNrAdministrariPeZi() + " pe zi.");
    }
}
