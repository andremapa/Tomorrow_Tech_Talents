package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.util.Arrays;

public class Book extends Product{

    protected String[] genres;
    protected String writer;
    protected String publishingCompany;

    public Book(String name, int id, double price) {
        super(name, id, price);
    }

    public Book(String name, int id, double price, String[] genres, String writer, String publishingCompany) {
        super(name, id, price);
        this.genres = genres;
        this.writer = writer;
        this.publishingCompany = publishingCompany;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof Book book){
            this.name = book.getName();
            this.id = book.getId();
            this.price = book.getPrice();
            this.genres = book.getGenres();
            this.writer = book.getWriter();
            this.publishingCompany = book.getPublishingCompany();
        }
        return this;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getWriter() {
        return writer;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genres=" + Arrays.toString(genres) +
                ", writer='" + writer + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
