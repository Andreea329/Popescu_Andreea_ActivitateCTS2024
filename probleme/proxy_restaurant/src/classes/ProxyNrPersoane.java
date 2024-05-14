package classes;

public class ProxyNrPersoane implements IRezervare{
    IRezervare rezervaMasa;
    private int nrMinPersoane=4;

    public ProxyNrPersoane(IRezervare rezervaMasa, int nrMinPersoane) {
        this.rezervaMasa = rezervaMasa;
        this.nrMinPersoane = nrMinPersoane;
    }

    @Override
    public void rezervaMasa(Persoana persoana) {
        if(persoana.getNrPersoaneLaMasa()>=nrMinPersoane){
            rezervaMasa.rezervaMasa(persoana);
        }else{
            System.out.println("Persoana "
                    +persoana.getNume()
                    +" nu poate face rezervare din cauza nr insuficient de persoane");
        }
    }
}
