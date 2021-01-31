package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class MenuItem {
    private double price;
    private String description;
    private ArrayList<String> categoryList = new ArrayList<>();
    private String category;
    private String date;

    public MenuItem(double price, String description, int categoryIndex) throws Exception {
        this.price = price;
        this.description = description;
        this.date = dateTimeFormatter(LocalDateTime.now());
        setCategory(categoryIndex);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getDate(){
        return date;
    }

    public void setCategory(int categoryIndex) throws Exception {
        Collections.addAll(categoryList,"Appetizer", "Main Course", "Dessert");
        if(categoryIndex > categoryList.size() || categoryIndex < 0){
            this.category = this.categoryList.get(categoryIndex);
            throw new Exception("\nPlease enter a valid category:\n1) Appetizer\n2) Main Course\n3) Dessert");
        } else{
            this.category = this.categoryList.get(categoryIndex);
        }
    }

    private String dateTimeFormatter(LocalDateTime now){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return formatter.format(now);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (!description.equals(menuItem.description)) return false;
        return category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "" +this.description + " ($"+this.price+")" + " - Added to menu on " + this.date +"\n";
    }

}
