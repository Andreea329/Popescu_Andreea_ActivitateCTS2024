package builder;

public class ClientFarmacieBuilder implements Builder{
    ClientFarmacie clientFarmacie;

    @Override
    public ClientFarmacie build() {
        return this.clientFarmacie;
    }

    public ClientFarmacieBuilder() {
        this.clientFarmacie = new ClientFarmacie(0,false,false,0);
    }

    public ClientFarmacieBuilder setNumarPungi(int nrPungi){
       this.clientFarmacie.setNumarPungi(nrPungi);
       return this;
    }

    public ClientFarmacieBuilder setPlataCuCard(boolean plataCuCard){
        this.clientFarmacie.setPlataCuCard(plataCuCard);
        return this;
    }

    public ClientFarmacieBuilder setCardFidelitate(boolean cardFidelitate){
        this.clientFarmacie.setCardFidelitate(cardFidelitate);
        return this;
    }

    public ClientFarmacieBuilder setCotaTVA(double cotaTVA){
        this.clientFarmacie.setCotaTVA(cotaTVA);
        return this;
    }
}
