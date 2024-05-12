package subject;

import observer.Observer;

public class Spital extends Subject {
    @Override
    public void notificaEpidemie() {
        super.trimiteNotificare("Va avea loc o epidemie, nu iesiti din case!");
    }
}
