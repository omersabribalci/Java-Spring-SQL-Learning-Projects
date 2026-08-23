package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale coke = new Coke("CocaCola", 50.0, "Kola", 330 );
        ProductForSale chocolate = new Chocolate("White Chocolate", 20.0, "Çikolata",20);
        ProductForSale bread = new Bread("Çavdar", 10.0, "Ekmek",250);
        ProductForSale[] products ={coke,chocolate,bread};
        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}