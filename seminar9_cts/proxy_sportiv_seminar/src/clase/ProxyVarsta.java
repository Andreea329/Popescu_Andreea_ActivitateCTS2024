package clase;

public class ProxyVarsta implements Vanzare{

    private Vanzare vanzareBilet; //dependency inversion
    private static int vasta=14;

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public void setVanzareBilet(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public static void setVasta(int vasta) {
        ProxyVarsta.vasta = vasta;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getVarsta() >= vasta){
            vanzareBilet.vanzare(persoana);
        }else {
            System.out.println("Persoana "+persoana.getNume() + " are varsta de "+persoana.getVarsta()+" ani si nu poate cumpara biletul.");
        }
    }
}
