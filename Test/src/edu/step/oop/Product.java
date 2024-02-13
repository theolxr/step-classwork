package edu.step.oop;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Introdu o cantitate pozitiva!!!");
        }
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Product initializeProductWithId(int productId) {
        return new Product(productId);
    }

    public static Product initializeProductWithAllAttributes(int productId, String name, double price, int quantity) {
        return new Product(productId, name, price, quantity);
    }

    public void updateQuantityBy(int quantityChange) {
        int newQuantity = this.quantity + quantityChange;
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Cantitatea negativa!!!");
        }
    }
}
