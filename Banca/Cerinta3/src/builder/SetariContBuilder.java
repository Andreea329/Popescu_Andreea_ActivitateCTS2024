package builder;

public class SetariContBuilder implements Builder{

    SetariCont setariCont;

    @Override
    public SetariCont build() {
        return this.setariCont;
    }

    public SetariContBuilder() {
        this.setariCont = new SetariCont(false,false,false);
    }

    public SetariContBuilder setContSalariu(boolean contSalariu){
        this.setariCont.setContSalariu(contSalariu);
        return this;
    }

    public SetariContBuilder setCardAtasat(boolean cardAtasat){
        this.setariCont.setCardAtasat(cardAtasat);
        return this;
    }

    public SetariContBuilder setInternetBanking(boolean internetBanking){
        this.setariCont.setInternetBanking(internetBanking);
        return this;
    }
}
