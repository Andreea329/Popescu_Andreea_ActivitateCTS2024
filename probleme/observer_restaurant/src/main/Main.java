package main;

import observer.Clienti;
import observer.Observer;
import subject.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer client=new Clienti("Ion");
        Restaurant restaurant=new Restaurant();

        restaurant.adaugaClient(client);
        restaurant.notificaReducerea();

    }
}