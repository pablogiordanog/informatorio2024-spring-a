package com.info.info_primera_app.entity;

import java.util.UUID;

public class Product {

    private UUID idProduct;
    private String name;
    private double price;

    public Product(UUID idProduct, String name, double price){
        this.setIdProduct(idProduct);
        this.setName(name);
        this.setPrice(price);
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
