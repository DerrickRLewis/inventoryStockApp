package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<NewItem> stockList = new ArrayList<>();

    //static HashMap<Integer, ArrayList<String>> stockListObjects = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Food pizza = new Food("PizzaHut",2);
        Clothing shirt = new Clothing("Polo",10);
        Transportation tire = new Transportation("Volvo",1);
        Electronics cellphone = new Electronics( "Iphone",2);
        Shelter paint = new Shelter("White Paint",5);
        menu();

        stockList.add(pizza);
        stockList.add(paint);
        stockList.add(tire);
        stockList.add(cellphone);
        stockList.add(shirt);


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

        System.out.println("How many are adding?");
        Integer itemAmount = Integer.valueOf(scanner.nextLine());
        System.out.println("Choose a category for your item :\n");
        System.out.println("1)Transportation 2)Food 3)Electronics 4)Clothing 5)Shelter");
        String itemCategory = scanner.nextLine();

        NewItem returnObject = new NewItem(nameItem,itemAmount,itemCategory);

        if (itemCategory.equalsIgnoreCase("1")) {
            returnObject.setCategory("Transportation");

        } else if (itemCategory.equalsIgnoreCase("2")) {
            returnObject.setCategory("Food");

        } else if (itemCategory.equalsIgnoreCase("3")) {
            returnObject.setCategory("Electronics");

        } else if (itemCategory.equalsIgnoreCase("4")) {
            returnObject.setCategory("Clothing");

        } else if (itemCategory.equalsIgnoreCase("5")) {
            returnObject.setCategory("Shelter");

        } else {
            throw new Exception("Invalid Option.");

        }stockList.add(returnObject);
            return returnObject;
    }


    private static void menu() throws Exception {
        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");

        while (true) {
            System.out.println("\n1|| Add new item to inventory\n");
            System.out.println("2||Reset Inventory\n");
            System.out.println("3||Print List");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                createItem();
                listView();
                System.out.println(stockList.toString());

            } else if (option.equals("2")) {

                System.out.println("Inventory has been cleared\n");
                stockList.clear();

            } else if (option.equals("3")) {
                System.out.println(stockList);

            }
        }
    }
    }



