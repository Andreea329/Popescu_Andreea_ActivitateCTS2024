package classes;

public class RezervareMasa implements IRezervare {
    private int nrMasa;

    public RezervareMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public void rezervaMasa(Persoana persoana) {
        System.out.println("Persoana "+
                persoana.getNume()+
                " vrea sa faca o rezervare pentru masa "
                +nrMasa+" de "+persoana.getNrPersoaneLaMasa()+
                " la nr de telefon "+persoana.getNrTelefon());
    }
}
