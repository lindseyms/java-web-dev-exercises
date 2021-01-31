package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {

    public static void main(String[] args) throws Exception {
        MenuItem item1 = new MenuItem(3.5, "Pizza", 1);
        MenuItem item2 = new MenuItem(5, "Ice Cream", 2);

        Menu menu = new Menu();
        menu.addItemToMenu(item1);
        menu.addItemToMenu(item2);

        System.out.println(menu.getMenuItems());

        System.out.println(menu.printMenu());

        menu.removeItemFromMenu(item2);

        System.out.println(menu.printMenu());

        menu.addItemToMenu(item2);
        System.out.println(menu.printMenu());
        menu.addItemToMenu(item2);
        System.out.println(menu.printMenu());

    }
}
