package com.sandersgutierrez.supermarket.domain;

public class Product {
    private int productId;
    private int categoryId;
    private String name;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public Product() {

    }

    public Product(int id) {
        this.productId = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return String.format("Product: {%d, %d, %s, %s, %s, %s}", productId, categoryId, name, price, stock, active ? "Active" : "Inactive");
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
