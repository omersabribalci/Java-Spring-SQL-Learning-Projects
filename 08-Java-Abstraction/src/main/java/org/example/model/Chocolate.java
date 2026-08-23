package org.example.model;

public class Chocolate extends ProductForSale {

    private double weight;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate: {" + "weight = " + weight +
                ", type = " + getType() +
                ", price = " + getPrice() +
                ", description = " + getDescription() +
                " }");
    }

    @Override
    public double getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }
}
