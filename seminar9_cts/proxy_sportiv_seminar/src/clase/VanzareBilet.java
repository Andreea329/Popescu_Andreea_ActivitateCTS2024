package clase;

public class VanzareBilet implements Vanzare{

    private String numeMeci;
    private float pretBilet;

    public VanzareBilet(String numeMeci, float pretBilet) {
        this.numeMeci = numeMeci;
        this.pretBilet = pretBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana " + persoana.getNume() +" a cumparat bilet la meciul "+ numeMeci+" si a platit "+pretBilet+" lei.");
    }
}
