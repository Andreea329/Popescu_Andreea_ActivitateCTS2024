package subject;

import observer.Observer;
import observer.Pacient;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer>observeri;

    public Subject() {
        this.observeri=new ArrayList<>();
    }
    public void adaugaPacient(Observer observer){
        observeri.add(observer);
    }
    public void trimiteNotificare(String mesaj){
        for (Observer observer:observeri){
            observer.primesteNotificarea(mesaj);
        }
    }
    public abstract void notificaEpidemie();
}
