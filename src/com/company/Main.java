package com.company;




import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> stockList = new ArrayList<>();


    public static void main(String[] args) throws Exception {


        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");



        while (true) {
            System.out.println("\n1|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();



            if (option.equals("1")) {
                createItem();
                listView();

            } else if (option.equals("2")) {

                System.out.println("Enter the name of the item you want to remove from the inventory\n");
                String option3 = scanner.nextLine();
                System.out.println(option3 + " will be removed from the inventory");


            } else if (option.equals("3")) {
                System.out.println("Enter the name and the qty of the item that you want to update:\n");
                String option4 = scanner.nextLine();

                System.out.println(option4 + " will be changed");


            } else if (option.equals("4")) {
                System.out.println(stockList);


            }
        }
    }




    private static void listView() {
        String name = "User";
        int items = stockList.size();
        String.format("Hello, %s! You have %s items in inventory!!.", name, items);
        System.out.printf("Hello, %s! You have %s items in inventory!!.", name, items);
    }

    public static NewItem createItem() throws Exception {




        System.out.println("What is the name of the item that you want to add to the inventory\n");

        String nameItem = scanner.nextLine();
        stockList.add(nameItem);


        System.out.println("How many are adding?");
        String itemAmount = scanner.nextLine();

        stockList.add(itemAmount);


        System.out.println("Choose a category for your item :\n");
        System.out.println("1)Automotive 2)Food 3)Electronics 4)Clothing");
        String itemCategory = scanner.nextLine();

        NewItem returnObject = new NewItem(nameItem,itemAmount,itemCategory);

        if (itemCategory.equalsIgnoreCase("1")) {
           returnObject.setCategory("Automotive");
            stockList.add(returnObject.category);
        } else if (itemCategory.equalsIgnoreCase("2")) {
            returnObject.setCategory("Food");
            stockList.add(returnObject.category);

        } else if (itemCategory.equalsIgnoreCase("3")) {
            returnObject.setCategory("Electronics");
            stockList.add(returnObject.category);

        } else if (itemCategory.equalsIgnoreCase("4")) {
            returnObject.setCategory("Clothing");
            stockList.add(returnObject.category);

        } else {
            throw new Exception("Invalid Option.");

        }

        return returnObject;


    }
}