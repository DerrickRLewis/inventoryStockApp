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

    public NewItem(String createScan, String cataScan, String categScan) {

    }

    public String getCategory() {
        return category;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "NewItem{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}