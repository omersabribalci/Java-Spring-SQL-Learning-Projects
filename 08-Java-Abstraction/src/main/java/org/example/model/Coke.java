package org.example.model;

public class Coke extends ProductForSale {
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    private double weight;

    public Coke(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke: {" + "weight = " + weight +
                ", type = " + getType() +
                ", price = " + getPrice() +
                ", description = " + getDescription() +
                " }");
    }

    @Override
    public String toString() {
        return "Coke{" +
                "weight=" + weight +
                '}';
    }
}
