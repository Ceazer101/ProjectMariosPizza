package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ActiveOrder activeOrder = new ActiveOrder();
    private Scanner scanner = new Scanner(System.in);
    private Menu MENU;

    public Controller(){
        MENU = new Menu();
    }

    public void start(){

    }

    public String seeMenu(){
        return MENU.toString();
    }

    public Pizza findPizza(int userInput){
        return MENU.findPizza(userInput);
    }

    public void createOrder(int orderNumber){
        boolean notDone = true;
        Order newOrder = new Order();
        newOrder.setOrderNumber(orderNumber);
        while(notDone){
            //saves pizza name in variable
            int userInput = scanner.nextInt();

            //if the user types 0, the loops ends
            //if the user does not enter 0, then you will keep adding to the order
            if (userInput == 0){
                notDone = false;
            } else {
                // if(userInput.equals())
                newOrder.addPizza(findPizza(userInput));
            }
        }
        activeOrder.addOrder(newOrder);
    }

    public ArrayList<Order> listOfActiveOrders() {
        activeOrder.showActiveOrders();
        return activeOrder.getOrders();
    }

}





