package main;

import classes.CaractersiticiClient;
import classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();

        CaractersiticiClient caractersiticiClient=new CaractersiticiClient(12,5,"12:00");
        CaractersiticiClient caractersiticiClient2=new CaractersiticiClient(14,6,"19:00");
        CaractersiticiClient caractersiticiClient3=new CaractersiticiClient(1,5,"18:00");

        fabrica.getClienti("Ana","09262933","a@gmail.com").rezerva(caractersiticiClient);
        fabrica.getClienti("Ana","09262933","a@gmail.com").rezerva(caractersiticiClient2);
        fabrica.getClienti("Ana","09262933","a@gmail.com").rezerva(caractersiticiClient3);
    }
}