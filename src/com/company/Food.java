package com.company;

/**
 * Created by Figure8 on 8/14/2016.
 */
public class Food extends NewItem {

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Food";
    }

    @Override
    public String toString() {
        return "Food{}";
    }
}
