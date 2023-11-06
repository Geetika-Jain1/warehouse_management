package org.example;



public class Product {
    private int productId;
    private String productname;
    private int price; // TODO: Change to currency
    private String description;

    public Product(int id, String productname, int price, String description) {
        this.productId = id;
        this.productname = productname;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productname + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
