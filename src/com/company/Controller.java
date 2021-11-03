package com.company;

public class Controller {

    private Menu MENU;
    private Order order;

    public Controller(){
        MENU = new Menu();
    }

    public void start(){

    }

    public Pizza createOrder(String userInput){
        for (Pizza pizza : MENU.getMenu()) {
            if (pizza.getName().equalsIgnoreCase(userInput)) {
                order.addOrder(pizza);
                return pizza;
            }
        }
        return null;
    }

    public void finishOrder(){

    }

    public String seeMenu(){
        return MENU.toString();
    }

}





