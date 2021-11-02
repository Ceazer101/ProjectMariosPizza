package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> menu = new ArrayList<>();

    //Hardcoded pizza's and added them to the arraylist
    public Menu(){
        addPizza(new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke, oregano", 57));
        addPizza(new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars, oregano", 53));
        addPizza(new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni, oregano", 57));
        addPizza(new Pizza(4, "Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, oregano", 63));
        addPizza(new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser, oregano", 65));
        addPizza(new Pizza(6, "Bertil", "tomatsauce, ost, bacon, oregano", 57));
        addPizza(new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven, oregano", 61));
        addPizza(new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg, oregano", 61));
        addPizza(new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili, oregano", 61));
        addPizza(new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon, oregano", 61));
        addPizza(new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas, oregano", 61));
        addPizza(new Pizza(12, "Le blissola", "tomatsauce, ost, skinke, rejer, oregeno", 61));
        addPizza(new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon, oregano", 61));
        addPizza(new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg, oregano", 61));

    }

    //adds pizza
    public void addPizza(Pizza pizza) {
        this.menu.add(pizza);
    }

    //returns the menu
    public ArrayList<Pizza> getMenu() {
        return menu;
    }
}
