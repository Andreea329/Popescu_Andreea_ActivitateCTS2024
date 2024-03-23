package simple_factory;

public class SupaPui extends Supa{
    public SupaPui(double gramaj, int pret, int nrPortiiVandute) {
        super(gramaj, pret, nrPortiiVandute);
    }

    @Override
    public void afisatiDetaliiVanzari() {
        System.out.println("Supa de pui cu gramajul de " + this.getGramaj() + " a fost vanduta la pretul de " + this.getPret() + " pentru un numar de " + this.getNrPortiiVandute() + " persoane.");
    }
}
