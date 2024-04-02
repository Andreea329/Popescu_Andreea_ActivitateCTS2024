package adapter.softNou;

public class Bautura {

    private float pret;
    private String denumire;
    private float  gradAlcol;

    public Bautura(float pret, String denumire, float gradAlcol) {
        this.pret = pret;
        this.denumire = denumire;
        this.gradAlcol = gradAlcol;
    }

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getGradAlcol() {
        return gradAlcol;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                ", gradAlcol=" + gradAlcol +
                '}';
    }
}
