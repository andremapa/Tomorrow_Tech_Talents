package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class AdultBook extends Book implements AdultProduct{

    private boolean isAdult;

    public AdultBook(String name, int id, double price, String[] genres, String writer, String publishingCompany, boolean isAdult) {
        super(name, id, price, genres, writer, publishingCompany);
        this.isAdult = isAdult;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof AdultBook adultBook){
            this.name = adultBook.getName();
            this.id = adultBook.getId();
            this.price = adultBook.getPrice();
            this.genres = adultBook.getGenres();
            this.writer = adultBook.getWriter();
            this.publishingCompany = adultBook.getPublishingCompany();
            this.isAdult = adultBook.isAdult();
        }
        return this;
    }

    @Override
    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "AdultBook{" +
                "isAdult=" + isAdult +
                ", genres=" + Arrays.toString(genres) +
                ", writer='" + writer + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
