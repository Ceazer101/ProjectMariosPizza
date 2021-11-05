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
                if (userInput > 14 || userInput < 0) {
                    System.out.println("det findes ikke en pizza med det nummer, prøv  igen.");
                } else {
                    newOrder.addPizza(findPizza(userInput));
                }
            }
        }
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





