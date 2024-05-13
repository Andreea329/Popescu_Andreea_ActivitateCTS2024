package decorator;

public class NotaDePlata implements INota{
    private float sumaPlata;

    public NotaDePlata(float sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public float getSumaPlata() {
        return sumaPlata;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Suma de plata este de "+sumaPlata+" lei.");
    }
}
