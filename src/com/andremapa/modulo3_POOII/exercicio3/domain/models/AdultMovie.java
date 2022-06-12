package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class AdultMovie extends Movie implements AdultProduct{

    private boolean isAdult;

    public AdultMovie(String name, int id, double price, String studio, String[] directors, String[] genres, String[] producers, boolean isAdult) {
        super(name, id, price, studio, directors, genres, producers);
        this.isAdult = isAdult;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof AdultMovie adultMovie){
            this.name = adultMovie.getName();
            this.id = adultMovie.getId();
            this.price = adultMovie.getPrice();
            this.studio = adultMovie.getStudio();
            this.directors = adultMovie.getDirectors();
            this.genres = adultMovie.getGenres();
            this.producers = adultMovie.getProducers();
            this.isAdult = adultMovie.isAdult();
        }
        return this;
    }

    @Override
    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "AdultMovie{" +
                "isAdult=" + isAdult +
                ", studio='" + studio + '\'' +
                ", directors=" + Arrays.toString(directors) +
                ", genres=" + Arrays.toString(genres) +
                ", producers=" + Arrays.toString(producers) +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
