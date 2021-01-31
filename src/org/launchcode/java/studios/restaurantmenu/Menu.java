package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu(){
        this.menuItems = new ArrayList<>();
    }

    public String getMenuItems() {
        String items = "";
        for(MenuItem menuItem : menuItems){
            items += menuItem.toString();
        }
        return items;
    }

    public void addItemToMenu(MenuItem item){
        if(!menuItems.contains(item)){
            this.menuItems.add(item);
        }
        else{
            System.out.println(item.getDescription() + " is already on the menu!");;
        }
    }

    public void removeItemFromMenu(MenuItem item){
        this.menuItems.remove(item);
    }

    public String dateMenuItemWasAdded(MenuItem item){
        return item.getDate();
    }

    public String dateMenuLastUpdated(){
        for (MenuItem item : menuItems){

        }
        return "";
    }

    public String printSingleMenuItem(MenuItem item){
        return item.toString();
    }

    public String printMenu(){
        String menu = "";
        for(MenuItem item : menuItems){
            menu += printSingleMenuItem(item);
        }
        return menu;
    }

}
