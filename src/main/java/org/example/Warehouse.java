package org.example;

import java.util.ArrayList;

public class Warehouse {
    private int id;
    private String location;
    private ArrayList<Product> products;

    public Warehouse(int id, String location) {
        this.id = id;
        setLocation(location);
        products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        // kista  / KISTA / kIsTa --> kista


        String firstLetter = location.substring(0, 1).toUpperCase();
        String rest = location.substring(1).toLowerCase();

        this.location = firstLetter + rest;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    /**
     * Adds a product to the warehouse stock
     *
     * @param product -  The product to add to the warehouse stock
     */

    public void addProduct(Product product) {
        products.add(product);

    }

    /**
     * Remove one product with the specified id
     *
     * @param id
     */
    public void removeProductById(int id) {
        // remove => id:1
        // id:1, name :iphone   <--
        // id:2, name : juice
        // id:2, name : iphone

        // loop over every product
        int index = getIndexOfFirstProductById(id);
        products.remove(index);

    }

    private int getIndexOfFirstProductById(int productId) {
        for (int i = 0; i < products.size(); i++) {

            //Save the product to local variable
            Product product = products.get(i);

            //If current products id == id to remove
            if (product.getProductId() == productId) { // <--


                //Exit loop and method
                return i;
            }
        }

        return -1;
    }

}