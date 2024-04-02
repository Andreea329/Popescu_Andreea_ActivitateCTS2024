package adapter.softVechi;

import adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs{
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura){
        super(bautura.getDenumire(),bautura.getPret());
        this.bautura=bautura; //am adaptat ca sa poate fi folosit ca un produs
    }


}
