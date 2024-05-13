package decorator;

public abstract class Decorator implements INota{
    INota notaDePlata;

    public Decorator(INota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public INota getNotaDePlata() {
        return notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }
    public abstract void adaugaUrarea();
}
