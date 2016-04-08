package com.company;

import java.util.Scanner;

/**
 * Created by admin on 4/4/16.
 */
public class NewItem {

    Scanner scanner = new Scanner(System.in);


    private Integer qty;
    private String name;

    public Integer getQty() {
        System.out.println("How many would you like to add to inventory?\n");
        return Integer.parseInt(scanner.nextLine());

    }

    public String getName() {
        System.out.println("What is the name of the item that you want to add to the inventory\n");
        return scanner.nextLine();
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewItem(String name, Integer qty) {
        this.name = name;
        this.qty = qty;

    }

    public void setQty() {

    }
}
