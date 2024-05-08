package classes;

public class Portar {
    private Verificator strategie;

    public Portar(Verificator strategie) {
        this.strategie = strategie;
    }

    public Portar() //verificare default
    {
        this.strategie=new VerificatorPeluza();
    }

    public void setStrategie(Verificator strategie) {
        this.strategie = strategie;
    }

    public void verificaSuporter(String numeSuporter){
        strategie.verificare(numeSuporter);
    }
}
