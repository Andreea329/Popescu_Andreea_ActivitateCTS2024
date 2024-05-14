package classes;

public class MasaDeRezervat {
    private int nrMasa;
    State stare;

    public MasaDeRezervat(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new Libera();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public State getStare() {
        return stare;
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
        if(this.getStare() instanceof Libera){
            State state=new Rezervata();
            state.setareStare(this);
            System.out.println("Masa cu nr "+nrMasa+" este rezervata.");
        }else{
            System.out.println("Masa cu nr "+nrMasa+" nu este libera pt rezervare.");
        }
    }

    public void elibereazaMasa(){
        if(this.getStare() instanceof Rezervata){
            State state=new Libera();
            state.setareStare(this);
            System.out.println("Masa cu nr "+nrMasa+" este eliberata.");
        }else{
            System.out.println("Masa cu nr "+nrMasa+" nu poate fi eliberata deoarece nu poate fi rezervata.");
        }
    }

    public void ocupaMasa(){
        if(this.getStare() instanceof Rezervata){
            State state=new Ocupata();
            state.setareStare(this);
            System.out.println("Masa cu nr "+nrMasa+" este rezervata si ocupata.");
        }else{
            System.out.println("Masa cu nr "+nrMasa+" nu poate fi ocupata  deoarece nu este rezervata.");
        }
    }
}
