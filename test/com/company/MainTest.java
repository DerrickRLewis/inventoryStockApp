package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by admin on 4/18/16.
 */
public class MainTest {
    @Test
    public void itemPrintList(){



        HashMap<String, Double> supplies = new HashMap<String, Double>();

        supplies.put("Sugar", new Double(3.34));
        supplies.put("Salt", new Double(1.22));
        supplies.put("Pepper", new Double(1.00));
        supplies.put("Basil", new Double(9.22));
        supplies.put("Garlic", new Double(-19.08));


        System.out.println(supplies);

    }

    @Test
    public void createItem() {

        NewItem newItem = new NewItem();

    }

    @Test
    public void removeItem(){

        HashMap<String, Double> supplies = new HashMap<String, Double>();

        supplies.put("Sugar", new Double(3.34));
        supplies.put("Salt", new Double(1.22));
        supplies.put("Pepper", new Double(1.00));
        supplies.put("Basil", new Double(9.22));
        supplies.put("Garlic", new Double(-19.08));

        supplies.remove("Sugar");
    }

@Test
    public void userInputtest() {

        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();

            System.out.println(option);


        }

    }
}