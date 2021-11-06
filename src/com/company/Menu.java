package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //Attribute.
    private ArrayList<Pizza> menu = new ArrayList<>();

    //Hardcoded pizza's and added them to the arraylist.
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
        addPizza(new Pizza(12, "Le blissola", "tomatsauce, ost, skinke, rejer, oregano", 61));
        addPizza(new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon, oregano", 61));
        addPizza(new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg, oregano", 61));

    }

    //adds pizza
    public void addPizza(Pizza pizza) {
        this.menu.add(pizza);
    }

    //Finds pizza.
    public Pizza findPizza(int userInput){

        //Loops through the menu.
        for (Pizza pizza : menu) {

            //If the user writes a pizza number that matches with a pizza number from the menu, the pizza is returned.
            if(userInput == pizza.getNumber()){
                return pizza;
            }
        }
        return null;
    }

    //TODO: delete if not used
    public ArrayList<Pizza> getMenu() {
        return menu;
    }

    //Returns the size of the menu.
    public int menuSize(){
        return menu.size();
    }

    @Override
    public String toString() {
        if (menu.size() > 0) {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(menu.get(i));
            }
        }
        return "";
    }
}
