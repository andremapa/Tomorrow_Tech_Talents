package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class Movie extends Product{

    protected String studio;
    protected String[] directors;
    protected String[] genres;
    protected String[] producers;

    public Movie(String name, int id, double price, String studio, String[] directors, String[] genres, String[] producers) {
        super(name, id, price);
        this.studio = studio;
        this.directors = directors;
        this.genres = genres;
        this.producers = producers;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof Movie movie){
            this.name = movie.getName();
            this.id = movie.getId();
            this.price = movie.getPrice();
            this.studio = movie.getStudio();
            this.directors = movie.getDirectors();
            this.genres = movie.getGenres();
            this.producers = movie.getProducers();
        }
        return this;
    }

    public String getStudio() {
        return studio;
    }

    public String[] getDirectors() {
        return directors;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getProducers() {
        return producers;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "studio='" + studio + '\'' +
                ", directors=" + Arrays.toString(directors) +
                ", genres=" + Arrays.toString(genres) +
                ", producers=" + Arrays.toString(producers) +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
