package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Order order = new Order();
    private Scanner scanner = new Scanner(System.in);
    private Menu MENU;

    public Controller(){
        MENU = new Menu();
    }

    public String seeMenu(){
        return MENU.toString();
    }

    public Pizza findPizza(int userInput){
        return MENU.findPizza(userInput);
    }

    public void createOrder(){
        boolean notDone = true;
        Order newOrder = new Order();
        newOrder.setOrderNumber(order.getOrderNumber());
        while(notDone){
            //saves pizza name in variable
            int userInput = scanner.nextInt();

            //if the user types 0, the loops ends
            //if the user does not enter 0, then you will keep adding to the order
            if (userInput == 0){
                notDone = false;
            } else {
                if (userInput > MENU.menuSize() || userInput < 0) {
                    System.out.println("Der findes ikke en pizza med det nummer, prøv  igen."); //TODO: not good practice!
                } else {
                    newOrder.addPizza(findPizza(userInput));
                }
            }
        }
        order.orderCounter();
        order.addOrder(newOrder);
    }

    public ArrayList<Order> listOfActiveOrders() {
        order.showActiveOrders();
        return order.getOrders();
    }

    public void saveOrder() throws IOException {
        File file = new File("data/historik.txt");
        FileWriter fileWriter = new FileWriter(file, true);

        for (Order order : order.getOrders()) {
            fileWriter.append(order.makeStringPizzaName() + " ");
            fileWriter.append("\n");

        }
        fileWriter.close();
        order.clearOrders();
    }



}





