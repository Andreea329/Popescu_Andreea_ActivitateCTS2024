package observer;

public class Vecini implements Observer{

    private String nume;
    private float distanta;


    public Vecini(String nume, float distantaKm) {
        this.nume = nume;
        this.distanta = distantaKm;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+ " , abonatii de la sala situatata la distanta de "+ distanta+
                " au primit urmatorul mesaj "+ mesaj);
    }
}
