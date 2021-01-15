package com.hhw.station.model;

public class Product {
    private int id;
    private String productName;
    private int salePrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        System.out.println("===dev===");
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", salePrice=" + salePrice +
                '}';
    }
}