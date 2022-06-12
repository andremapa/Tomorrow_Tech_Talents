package com.andremapa.modulo3_POOII.exercicio3.domain.models;

public class AdultToy extends Toy implements AdultProduct{

    private boolean isAdult;

    public AdultToy(String name, int id, double price, String type, boolean isAdult) {
        super(name, id, price, type);
        this.isAdult = isAdult;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof AdultToy adultToy){
            this.name = adultToy.getName();
            this.id = adultToy.getId();
            this.price = adultToy.getPrice();
            this.type = adultToy.getType();
            this.isAdult = adultToy.isAdult();
        }
        return this;
    }

    @Override
    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "AdultToy{" +
                "isAdult=" + isAdult +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
