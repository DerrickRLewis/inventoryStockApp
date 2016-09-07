package com.company;

/**
 * Created by Figure8 on 8/14/2016.
 */
public class Electronics extends NewItem {

    public Electronics(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Electronics";
    }

    @Override
    public String toString() {
        return "Electronics{}";
    }
}
