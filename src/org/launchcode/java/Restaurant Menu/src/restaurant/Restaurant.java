package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main (String[] args) {
        MenuItem chickenStrips = new MenuItem(2.50, "chicken strips", "Appetizer", false);
        MenuItem chickenStripsTwo = new MenuItem(2.50, "chicken strips", "Appetizer", false);
        MenuItem houseSalad = new MenuItem(8.00, "a salad", "entree", true);
        MenuItem chickenSandwich = new MenuItem(11.50, "a sandwich", "entree", false);

        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        items.add(chickenStrips);
        items.add(houseSalad);
        items.add(chickenSandwich);

        Menu menu = new Menu(items);

        menu.printMenu();
        System.out.println();
        menu.printMenuItem(items.get(1));

        System.out.println();

        menu.removeItem(chickenStrips);
        menu.printMenu();

        System.out.println();

        if (menu.isEqual(chickenStrips, chickenStripsTwo)) {
            System.out.println("same item");
        } else {
            System.out.println("not the same item");
        }

        System.out.println();

        menu.addItem(chickenStrips);
        menu.addItem(chickenStrips);
    }
}
