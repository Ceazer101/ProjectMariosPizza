package com.company;

public class Controller {

    private Menu MENU;
    //private Order order = new Order();

    public Controller(){
        MENU = new Menu();
    }

    public void start(){

    }

    public Pizza createOrder(String userInput){
        for (Pizza pizza : MENU.getMenu()) {
            if (pizza.getName().equalsIgnoreCase(userInput)) {
                Main.order.addOrder(pizza);
                return pizza;
            }
        }
        return null;
    }

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





