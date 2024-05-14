package classes;

public class OcupareMasaRestaurant extends Template {
    private Restaurant restaurant;

    public OcupareMasaRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void curataMasa() {
        System.out.println("Se curata masa "+restaurant.getNrMasa());
    }

    @Override
    public void puneServetele() {
        System.out.println("Se pun servetelele pe masa "+restaurant.getNrMasa());

    }

    @Override
    public void asazaTacamurile() {
        System.out.println("Se aseaza tacamuri pe masa "+restaurant.getNrMasa());

    }

    @Override
    public void invitaPersoaneLaMasa() {
        System.out.println("Se invita clienti la masa "+restaurant.getNrMasa());
    }
}
