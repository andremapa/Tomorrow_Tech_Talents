package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class MusicAlbum extends Product{

    protected String[] bands;
    protected String[] genres;
    protected String[] stamps;

    public MusicAlbum(String name, int id, double price, String[] bands, String[] genres, String[] stamps) {
        super(name, id, price);
        this.bands = bands;
        this.genres = genres;
        this.stamps = stamps;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if(product instanceof MusicAlbum musicAlbum){
            this.name = musicAlbum.getName();
            this.id = musicAlbum.getId();
            this.price = musicAlbum.getPrice();
            this.bands = musicAlbum.getBands();
            this.genres = musicAlbum.getGenres();
            this.stamps = musicAlbum.getStamps();
        }
        return this;
    }

    public String[] getBands() {
        return bands;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getStamps() {
        return stamps;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "bands=" + Arrays.toString(bands) +
                ", genres=" + Arrays.toString(genres) +
                ", stamps=" + Arrays.toString(stamps) +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
