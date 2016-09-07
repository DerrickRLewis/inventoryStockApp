package com.company;

/**
 * Created by Figure8 on 8/14/2016.
 */
public class Clothing extends NewItem {

    public Clothing(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Clothing";
    }

    @Override
    public String toString() {
        return "Clothing{}";
    }
}
