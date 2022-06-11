package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class AdultMusicAlbum extends MusicAlbum{

    private boolean isAdult;

    public AdultMusicAlbum(String name, int id, double price, String[] bands, String[] genres, String[] stamps, boolean isAdult) {
        super(name, id, price, bands, genres, stamps);
        this.isAdult = isAdult;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if(product instanceof AdultMusicAlbum adultMusicAlbum){
            this.name = adultMusicAlbum.getName();
            this.id = adultMusicAlbum.getId();
            this.price = adultMusicAlbum.getPrice();
            this.bands = adultMusicAlbum.getBands();
            this.genres = adultMusicAlbum.getGenres();
            this.stamps = adultMusicAlbum.getStamps();
            this.isAdult = adultMusicAlbum.isAdult();
        }
        return this;
    }

    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "AdultMusicAlbum{" +
                "isAdult=" + isAdult +
                ", bands=" + Arrays.toString(bands) +
                ", genres=" + Arrays.toString(genres) +
                ", stamps=" + Arrays.toString(stamps) +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
