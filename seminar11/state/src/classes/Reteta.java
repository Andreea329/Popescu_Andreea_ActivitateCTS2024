package classes;

public class Reteta {
    int nrReteta;
    int nrMedicamente;
    State stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicament(){
        if (this.stare instanceof Emisa){
            System.out.println("Reteta cu nr " + nrReteta+" solicita "+nrMedicamente+" medicamente.");
//            this.stare=new Solicitata();
//
            //alta varianta
            State solicitata= new Solicitata();
            solicitata.schimbaStarea(this); //obiectul curent pentru ca suntem deja in clasa reteta
        }else {
            System.out.println("Medicamentele din reteta "+nrReteta+" nu pot fi solicitate");
        }
    }

   public void cumparaMedicamente(){
        if(this.stare instanceof Solicitata){
            System.out.println("Reteta cu nr " + nrReteta+" achizitioneaza "+nrMedicamente+" medicamente.");
            State achizitionata= new Achizitionata();
            achizitionata.schimbaStarea(this);
        }else {
            System.out.println("Medicamentele din reteta "+nrReteta+" nu pot fi achizitionate");
        }
    }
    public void respingeAchizitie(){
        if(this.stare instanceof Solicitata){
            System.out.println("Ne pare rau, medicamentele din retate "+nrReteta+" nu sunt disponibile!");
            State solicitata= new Emisa();
            solicitata.schimbaStarea(this);
        }else {
            System.out.println("Reteta nu poate fi respinsa!");
        }
    }
    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", nrMedicamente=" + nrMedicamente +
                ", stare=" + stare +
                '}';
    }
}
