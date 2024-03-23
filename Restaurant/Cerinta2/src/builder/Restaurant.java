package builder;

public class Restaurant {

    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Restaurant(boolean asezareGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "asezareGeam=" + asezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
