package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdatedDate;

    public Menu( ArrayList<MenuItem> items ) {
        this.items = items;
    }

    public void addItem( MenuItem item ) {
        if (items.contains(item)) {
            System.out.println("You're trying to add a duplicate item. I'm afraid I can't let you do that.");
        } else {
            items.add(item);
        }
    }

    public void removeItem( MenuItem item ) {
        items.remove(item);
    }

    public boolean isNewItem( MenuItem item ) {
        if (item.getNew()) return true;

        return false;
    }

    public Date lastUpdated() {
        return lastUpdatedDate;
    }

    public void printMenuItem( MenuItem item) {
        System.out.printf("$%.2f  %s  %s%n", item.getPrice(), item.getCategory(), item.getDescription());
    }

    public void printMenu() {
        for (MenuItem item : items) {
            printMenuItem(item);
        }
    }

    public boolean isEqual( MenuItem itemOne, MenuItem itemTwo ) {
        if (itemOne.getPrice() == itemTwo.getPrice() &&
            itemOne.getDescription() == itemTwo.getDescription() &&
            itemOne.getCategory() == itemTwo.getCategory()) return true;

        return false;
    }
}
