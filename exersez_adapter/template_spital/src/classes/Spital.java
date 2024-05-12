package classes;

public class Spital extends Template{
    private String numeSpital;
    private int nrPaturi;

    public Spital(String numeSpital, int nrPaturi) {
        this.numeSpital = numeSpital;
        this.nrPaturi = nrPaturi;
    }

    @Override
    protected void analizeazaStarea(Pacient pacient) {
        pacient.setStare(pacient.getStare());
        System.out.println("Pacientul "+pacient.getNume()+" are starea "+pacient.getStare());
    }

    @Override
    protected int verificaDisponibilitatea() {
        if(nrPaturi>0){
            return  nrPaturi;
        }
        else
            return 0;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" este internat la spitalul "+ numeSpital);
        nrPaturi--;
        System.out.println("Nr de paturi ramas este: "+nrPaturi);
    }

    @Override
    protected void refuzaInternarea(Pacient pacient) {
            System.out.println("Pacientul "+pacient.getNume()+" nu poate fi internat in spitalul "+numeSpital);
    }
}
