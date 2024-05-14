package main;

import classes.OcupareMasaRestaurant;
import classes.Restaurant;
import classes.Template;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant(2);

        Template template=new OcupareMasaRestaurant(restaurant);
        template.curataMasa();
        template.puneServetele();
        template.asazaTacamurile();
        template.invitaPersoaneLaMasa();
    }
}