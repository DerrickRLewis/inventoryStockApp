package com.company;
/**
 Print out the inventory items and then list the options.
 If the user enters 1, let them create a new item by entering its name.
 If the user enters 2, let them remove an item by its number.
 If the user enters 3, let them update the quantity of that item.
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> itemNames = new ArrayList<>();
    static HashMap<ArrayList , Double> supplies = new HashMap<>();

    public static void main(String[] args) throws Exception {
        NewItem newItem = new NewItem();



//        supplies.put("Sugar", new Double(3.34));
//        supplies.put("Salt", new Double(1.22));
//        supplies.put("Pepper", new Double(1.00));
//        supplies.put("Basil", new Double(9.22));
//        supplies.put("Garlic", new Double(-19.08));


        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");



        while (true) {
            System.out.println("\n11|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();


            if (option.equals("1")) {


                createItem(newItem); listview();




            } else if (option.equals("2")) {

                System.out.println("Enter the name of the item you want to remove from the inventory\n");
                String option3 = scanner.nextLine();
                System.out.println(option3 + " will be removed from the inventory");


            } else if (option.equals("3")) {
                System.out.println("Enter the name and the qty of the item that you want to update:\n");
                String option4 = scanner.nextLine();

                System.out.println(option4 + " will be changed");


            } else if (option.equals("4")) {
                System.out.println(supplies + newItem.category);


            }
        }
    }

    private static void listview() {
        String name = "User";
        int items = supplies.size();
        String.format("Hello, %s! You have %s items in inventory!!.", name, items);
        System.out.printf("Hello, %s! You have %s items in inventory!!.", name, items);
    }

    private static NewItem createItem(NewItem newItem) throws Exception{

        System.out.println("What is the name of the item that you want to add to the inventory\n");
        scanner.hasNext();
            String createScan = scanner.nextLine();
            itemNames.add(createScan);
            System.out.println ("How many are adding?");
            String cataScan = scanner.nextLine();
            supplies.put(itemNames, Double.valueOf(cataScan));
            System.out.println("Choose a category for your item :\n");
            System.out.println ("1)Automotive 2)Food 3)Electronics 4)Clothing");
            String categScan= scanner.nextLine();

        if (categScan.equalsIgnoreCase("1") ) {
            newItem.setCategory("Automotive");
        }else if (categScan.equalsIgnoreCase("2")){
                newItem.setCategory("Food");
            } else if (categScan.equalsIgnoreCase("3")){
        newItem.setCategory("Electronics");
        }else if(categScan.equalsIgnoreCase("4")){
        newItem.setCategory("Clothing");
        } else {
            throw new Exception("Invalid Option.");



        }

        return new NewItem(newItem.category);
    }

}