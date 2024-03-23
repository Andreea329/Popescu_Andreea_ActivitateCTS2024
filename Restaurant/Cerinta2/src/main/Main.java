package main;

import builder.Restaurant;
import builder.RestaurantBuilder;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant1= new RestaurantBuilder()
                .setAsezareGeam(true)
                .setDecorareMasa(true)
                .setScauneErgonomice(false)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica(false)
                .build();

        Restaurant restaurant2= new RestaurantBuilder()
                .setAsezareGeam(false)
                .setDecorareMasa(true)
                .setScauneErgonomice(false)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica(true)
                .build();

        Restaurant restaurant3= new RestaurantBuilder()
                .setAsezareGeam(false)
                .setDecorareMasa(true)
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica(false)
                .build();

        Restaurant restaurant4= new RestaurantBuilder()
                .setAsezareGeam(true)
                .setDecorareMasa(true)
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica(true)
                .build();

        System.out.println(restaurant1.toString());
        System.out.println(restaurant2.toString());
        System.out.println(restaurant3.toString());
        System.out.println(restaurant4.toString());
    }
}