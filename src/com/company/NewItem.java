package com.company;

/**Resubmit
 * Created by admin on 4/4/16.
 */
public class NewItem {


    public Integer quantity;
    public String name;
    public String category;



    public NewItem(Integer quantity, String name, String category) {
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }

    public NewItem(String name, int quantity, String category) {
        this.quantity = quantity;
        this.name = name;
        this.category = category;

    }

    public NewItem() {
    }

    public String getCategory() {
        return category;
    }

    // subclasses

    public class Pizza extends NewItem {
        public Pizza(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Food";
        }
    }

    public class Shirt extends NewItem {
        public Shirt(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Shirt";
        }


    }

    public class Tire extends NewItem {
        public Tire(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Automotive";
        }
    }

    public class Cellphone extends NewItem {
        public Cellphone(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Electronics";
        }
    }
    public class Paint extends NewItem {
        public Paint(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Art";
        }
    }

}