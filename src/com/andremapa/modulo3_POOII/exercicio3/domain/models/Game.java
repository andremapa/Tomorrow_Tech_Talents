package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class Game extends Product{

    protected String distributor;
    protected String[] genres;
    protected String studio;

    public Game(String name, int id, double price, String distributor, String[] genres, String studio) {
        super(name, id, price);
        this.distributor = distributor;
        this.genres = genres;
        this.studio = studio;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if(product instanceof Game game){
            this.name = game.getName();
            this.id = game.getId();
            this.price = game.getPrice();
            this.distributor = game.getDistributor();
            this.genres = game.getGenres();
            this.studio = game.getStudio();
        }
        return this;
    }

    public String getDistributor() {
        return distributor;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getStudio() {
        return studio;
    }

    @Override
    public String toString() {
        return "Games{" +
                "distributor='" + distributor + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", studio='" + studio + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
