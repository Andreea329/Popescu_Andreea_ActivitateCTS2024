package builder;

public class SetariCont {

    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public SetariCont(boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
        this.contSalariu = contSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "SetariCont{" +
                "contSalariu=" + contSalariu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}
