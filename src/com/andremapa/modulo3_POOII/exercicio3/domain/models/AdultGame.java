package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class AdultGame extends Game implements AdultProduct{

    private boolean isAdult;

    public AdultGame(String name, int id, double price, String distributor, String[] genres, String studio, boolean isAdult) {
        super(name, id, price, distributor, genres, studio);
        this.isAdult = isAdult;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if(product instanceof AdultGame adultGame){
            this.name = adultGame.getName();
            this.id = adultGame.getId();
            this.price = adultGame.getPrice();
            this.distributor = adultGame.getDistributor();
            this.genres = adultGame.getGenres();
            this.studio = adultGame.getStudio();
            this.isAdult = adultGame.isAdult();
        }
        return this;
    }

    @Override
    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "AdultGame{" +
                "isAdult=" + isAdult +
                ", distributor='" + distributor + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", studio='" + studio + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
