package com.company;

/**
 * Created by Figure8 on 8/14/2016.
 */
public class Transportation extends NewItem {
    public Transportation(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Transportation";

    }



    @Override
    public String toString() {
        return "Transportation{}";
    }
}
