package factory_method;

public class SupaVita extends Supa{
    public SupaVita(double gramaj, int pret, int nrPortiiVandute) {
        super(gramaj, pret, nrPortiiVandute);
    }

    @Override
    public void afisatiDetaliiVanzari() {
        System.out.println("Supa de vita cu gramajul de " + this.getGramaj() + " a fost vanduta la pretul de " + this.getPret() + " pentru un numar de " + this.getNrPortiiVandute() + " persoane.");
    }
}
