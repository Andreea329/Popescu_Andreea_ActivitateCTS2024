package decorator;

public class NotaCuUrare extends Decorator{
    @Override
    public void adaugaUrarea() {
        System.out.println("La multi ani fericiti!");
    }

    public NotaCuUrare(INota notaDePlata) {
        super(notaDePlata);
    }
}
