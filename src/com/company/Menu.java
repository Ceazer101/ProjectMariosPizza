package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> menu = new ArrayList<Pizza>();

    public Menu(){
        addPizza(new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke, oregano", 57));
        addPizza(new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars, oregano", 53));
        addPizza(new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni, oregano", 57));
        /*Pizza vesuvio = new Pizza(4, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(5, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(6, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(7, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(8, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(9, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(10, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(11, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(12, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(13, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);
        Pizza vesuvio = new Pizza(14, "Vesuvio", "tomatsovs, ost, skinke, oregano,", 57);*/
    }

    private void addPizza(Pizza pizza) {
        this.menu.add(pizza);
    }


    public ArrayList<Pizza> getMenu() {
        return menu;
    }
}
