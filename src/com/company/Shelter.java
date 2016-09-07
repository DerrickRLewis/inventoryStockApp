package com.company;

/**
 * Created by Figure8 on 8/14/2016.
 */
public class Shelter extends NewItem {
    @Override
    public String toString() {
        return "Shelter{}";
    }

    public Shelter(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Shelter";

    }
}
