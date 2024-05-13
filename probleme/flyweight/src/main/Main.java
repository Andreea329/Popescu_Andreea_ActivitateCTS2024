package main;

import classes.CaracterisSalon;
import classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        CaracterisSalon caracterisSalon1= new CaracterisSalon(12,10,4);
        CaracterisSalon caracterisSalon2= new CaracterisSalon(14,9,7);
        CaracterisSalon caracterisSalon3= new CaracterisSalon(10,11,2);

        fabrica.getPacienti("Ana","0757682323","adresa 1").prezintaInformatii(caracterisSalon1);
        fabrica.getPacienti("Ana","0757682323","adresa 1").prezintaInformatii(caracterisSalon3);
        fabrica.getPacienti("Ionut","0879757886","adresa2").prezintaInformatii(caracterisSalon3);
    }
}