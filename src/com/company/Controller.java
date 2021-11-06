package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    //Attributes
    private Order order = new Order();
    private Menu MENU;

    //Constructor
    public Controller(){
        MENU = new Menu();
    }

    //Returns the menu
    public String seeMenu(){
        return MENU.toString();
    }

    //Returns the method findPizza
    public Pizza findPizza(int userInput){
        return MENU.findPizza(userInput);
    }

    //Creates order(s)
    public void createOrder(Scanner scanner){

        //Initializing variable
        boolean notDone = true;

        //Initializing an Order object
        Order newOrder = new Order();

        //TODO: make a comment here
        newOrder.setOrderNumber(order.getOrderNumber());

        while(notDone){

            //Saves pizza number in variable.
            int userInput = scanner.nextInt();

            //If the user types 0, the loops ends.
            //If the user does not enter 0, then you will keep adding to the order.
            if (userInput == 0){
                notDone = false;
            } else {
                //If the user types a number lower than 0 or greater than the menu size, it prints error message.
                //If the user enters a valid number, the pizza is added to the order.
                if (userInput > MENU.menuSize() || userInput < 0) {
                    System.out.println("Der findes ikke en pizza med det nummer, prøv  igen."); //TODO: not good practice!
                } else {
                    newOrder.addPizza(findPizza(userInput));
                }
            }
        }
        //Counts when an order is finished and adds 1 to the order number.
        order.orderCounter();
        order.addOrder(newOrder);
    }

    //Shows list of active order(s).
    public ArrayList<Order> listOfActiveOrders() {

        //Prints active orders.
        order.showActiveOrders();

        //If the number of orders are greater than 0, the orders are shown.
        //If the number of orders are under 0, error message gets printed.
        if (order.numbersOfOrders() > 0) {
            return order.getOrders();
        } else {
            System.out.println("Der er ikke nogen aktive bestillinger"); //TODO: not good practice!
        }
        return null;
    }

        //Saves order(s).
        public void saveOrder() {

            //Initializing a file.
            File file = new File("data/historik.txt");

        try {
            //Initializing FileWriter object.
            FileWriter fileWriter = new FileWriter(file, true);

            //Loops through the orders and writes the orders in the file.
            for (Order order : order.getOrders()) {
                fileWriter.append(order.makeStringPizzaName() + " ");
                fileWriter.append("\n");
            }
            //Closes file.
            fileWriter.close();

            //Clear orders.
            order.clearOrders();

        }catch (IOException e){
            e.printStackTrace();
            }
    }
}





