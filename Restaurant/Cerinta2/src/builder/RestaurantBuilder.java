package builder;

public class RestaurantBuilder implements Builder {
    Restaurant restaurant;

    @Override
    public Restaurant build() {
        return this.restaurant;
    }

    public RestaurantBuilder() {
       this.restaurant= new Restaurant(false,false,false,false,false);
    }

    public  RestaurantBuilder setAsezareGeam(boolean asezareGeam){
        this.restaurant.setAsezareGeam(asezareGeam);
        return this;
    }

    public RestaurantBuilder setScauneErgonomice(boolean scauneErgonomice){
        this.restaurant.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RestaurantBuilder setDecorareMasa(boolean decorareMasa){
        this.restaurant.setScauneErgonomice(decorareMasa);
        return this;
    }

    public RestaurantBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata){
        this.restaurant.setScauneErgonomice(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RestaurantBuilder setGenMuzica(boolean genMuzica){
        this.restaurant.setScauneErgonomice(genMuzica);
        return this;
    }


}
