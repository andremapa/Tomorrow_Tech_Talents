package com.andremapa.modulo3_POOII.exercicio3.domain.models;

public class Toy extends Product{

    protected String type;

    public Toy(String name, int id, double price, String type) {
        super(name, id, price);
        this.type = type;
    }

    @Override
    public <T extends Product> Product updateData(T product) {
        if (product instanceof Toy toy){
            this.name = toy.getName();
            this.id = toy.getId();
            this.price = toy.getPrice();
            this.type = toy.getType();
        }
        return this;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
