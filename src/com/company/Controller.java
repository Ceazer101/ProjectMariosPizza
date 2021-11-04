package com.company;

import java.util.ArrayList;

public class Controller {

    private Menu MENU;
    //private Order order = new Order();

    public Controller(){
        MENU = new Menu();
    }

    public void start(){

    }



    /*public ArrayList<Order> createOrder(int orderNumber, String userInput){

        ArrayList<Order> allOrders = new ArrayList<>();

        for (Pizza pizza : MENU.getMenu()) {
            if (pizza.getName().equalsIgnoreCase(userInput)) {
                allOrders.add(new Order(orderNumber, userInput));
            }
        }
        return allOrders;
    }
*/
    /*public void finishOrder(){
            for (Pizza pizza : MENU.getMenu()) {
                if (pizza.getName().equalsIgnoreCase(userInput)) {
                    order.addOrder(pizza);
                    return pizza;
                }
            }
            return null;
        }*/


    public String seeMenu(){
        return MENU.toString();
    }

}





