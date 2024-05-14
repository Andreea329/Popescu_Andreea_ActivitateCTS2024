package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer>observeri;

    public Subject() {
        this.observeri=new ArrayList<>();
    }

    public List<Observer> getObserveri() {
        return observeri;
    }

    public void setObserveri(List<Observer> observeri) {
        this.observeri = observeri;
    }

    public void trimiteOferta(String mesaj){
        for(Observer observer:observeri){
            observer.primesteOferta(mesaj);
        }
    }

    public void adaugaClient(Observer observer){
        observeri.add(observer);
    }
    public abstract void notificaReducerea();
}
