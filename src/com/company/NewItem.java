package com.company;

import java.util.Scanner;

/**
 * Created by admin on 4/4/16.
 */
public class NewItem {

    Scanner scanner = new Scanner(System.in);



    private Integer quantity;
    private String name;
    private  String category;







    //public Integer quantityPrompt() {
        //System.out.println("How many would you like to add to inventory?\n");
       // return Integer.parseInt(scanner.nextLine());



    public String getName() {
        System.out.println("What is the name of the item that you want to add to the inventory\n");
        return scanner.nextLine();
    }

    public String getCategory(){
        return category;
    }


    public Integer getQuantity() {
        return quantity;
    }

   //

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty() {

      }

    }

