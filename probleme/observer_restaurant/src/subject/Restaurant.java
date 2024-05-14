package subject;

public class Restaurant extends Subject {

    @Override
    public void notificaReducerea() {
        super.trimiteOferta("Reducere de 20% la cartofi prajiti.");
    }
}
