package clase;

public class Caracteristici {
    private int pozitiex;
    private int pozitiey;
    private String culoarea;

    public Caracteristici(int pozitiex, int pozitiey, String culoarea) {
        this.pozitiex = pozitiex;
        this.pozitiey = pozitiey;
        this.culoarea = culoarea;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitiex=" + pozitiex +
                ", pozitiey=" + pozitiey +
                ", culoarea='" + culoarea + '\'' +
                '}';
    }
}
