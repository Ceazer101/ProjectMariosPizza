package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Controller {

    //Attributes
    private Order order;
    private Menu MENU;

    private UserInterface ui;

    //Constructor
    public Controller(){
        MENU = new Menu();
        ui = new UserInterface();
        order = new Order();
    }

    public void start(){
        ui.printMessage("Velkommen til PizzaMaster 9000");
        userOptions();
    }

    public void userOptions() {

        //Initializing variable.
        boolean running = true;


        while (running) {

            String input = ui.readUserInput();

            switch(input) {
                case "opret", "o":
                    //prints the menu
                    seeMenu();

                    //creates order.
                    createOrder();
                    break;

                case "ret" , "r":
                    //TODO: make edit function if there is time
                    break;

                case "gem", "g":
                    saveOrder();
                    break;

                case "afslut", "a":
                    saveOrder();
                    running = false;
                    break;

                case "se", "s":
                    listOfActiveOrders();
                    break;

                case "menu", "m":
                    seeMenu();
                    break;

                default:
                    System.out.println("Det forstod vi ikke helt, prøv at indtast en ny kommando.");
                    break;
            }
        }
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
    public void createOrder(){

        //Initializing variable
        boolean notDone = true;
        int userInput = -1;

        //Initializing an Order object
        Order newOrder = new Order();

        //TODO: make a comment here
        newOrder.setOrderNumber(order.getOrderNumber());

        //asks the user for pizza name
        ui.printMessage("indtast venligst nummer på den pizza der skal tilføjes (Slut bestilling med '0'): ");


            while(notDone){

                    //Saves pizza number in variable.
                    userInput = ui.validateInput();

                    //If the user types 0, the loops ends.
                    //If the user does not enter 0, then you will keep adding to the order.
                    if (userInput == 0) {
                        notDone = false;
                    } else {
                        //If the user types a number lower than 0 or greater than the menu size, it prints error message.
                        //If the user enters a valid number, the pizza is added to the order.
                        if (userInput > MENU.menuSize() || userInput < 0) {
                            ui.printMessage("Der findes ikke en pizza med det nummer, prøv  igen.");
                        } else {
                            newOrder.addPizza(findPizza(userInput));
                        }
                    }
            }

        //Counts when an order is finished and adds 1 to the order number.
        order.orderCounter();
        order.addOrder(newOrder);
    }

    public ArrayList<Order> listOfActiveOrders() {

        //Prints active orders.
        showActiveOrders();

        //If the number of orders are greater than 0, the orders are shown.
        //If the number of orders are under 0, error message gets printed.
        if (order.numbersOfOrders() > 0) {
            return order.getOrders();
        } else {
            ui.printMessage("Der er ikke nogen aktive bestillinger");
        }
        return null;
    }

    //Prints the list of active orders.
    public void showActiveOrders(){

        //Loops through the list of orders and prints the order number.
        for (Order order: order.getOrders() ){
            ui.printMessage("(" + order.getOrderNumber() + ")");

            //Loops through the list of pizza's and prints the pizza number and pizza name.
            for (Pizza pizza : order.getPizzas()) {
                ui.printMessage(pizza.getNumber() + "  ");
                ui.printMessage(pizza.getName());
            }
        }
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
                fileWriter.append(makeStringPizzaName() + " ");
                fileWriter.append("\n");
            }
            //Closes file.
            fileWriter.close();

            //Clear orders.
            clearOrders();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void clearOrders(){
        // Makes a formatted string of pizza.
        //Clear order(s).
        order.getOrders().clear();

    }

    public String makeStringPizzaName(){

        //Initializing a StringBuilder object.
        StringBuilder stringBuilder = new StringBuilder();

        //Loops through the list of pizza's.
        for (Pizza pizza : order.getPizzas()) {

            //Adds the pizza number.
            stringBuilder.append(pizza.getNumber()).append(" ");

            //Adds the name of the pizza.
            stringBuilder.append(pizza.getName()).append(" ");
        }
        return stringBuilder.toString();
    }
}
