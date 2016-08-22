package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> stockList = new ArrayList<>();
    public static ArrayList<NewItem> stockListObjects = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        NewItem pizza = new NewItem(2,"PizzaHut","Food");
        NewItem shirt = new NewItem(7,"Polo","Clothing");
        NewItem tire = new NewItem(4,"BridgeStone","Automotive");
        NewItem cellphone = new NewItem(1,"Apple","Electronics");
        NewItem paint = new NewItem(1,"OilPaint","Art");

        stockListObjects.add(pizza);
        stockListObjects.add(paint);
        stockListObjects.add(tire);
        stockListObjects.add(cellphone);
        stockListObjects.add(shirt);


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
                System.out.println(stockListObjects.toString());


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
        String.format("Hello, %s! You have %s items in inventory!!", name, items);
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
        String itemCategoryChoice;



        NewItem returnObject = new NewItem(nameItem,itemAmount,itemCategory);

        if (itemCategory.equalsIgnoreCase("1")) {
        itemCategoryChoice ="Automotive";
            stockList.add(itemCategoryChoice);
        } else if (itemCategory.equalsIgnoreCase("2")) {
            itemCategoryChoice ="Food";
            stockList.add(itemCategoryChoice);

        } else if (itemCategory.equalsIgnoreCase("3")) {
            itemCategoryChoice ="Electronics";
            stockList.add(itemCategoryChoice);

        } else if (itemCategory.equalsIgnoreCase("4")) {
            itemCategoryChoice ="Clothing";
            stockList.add(itemCategoryChoice);

        } else {
            throw new Exception("Invalid Option.");

        }

        return returnObject;
    }
}