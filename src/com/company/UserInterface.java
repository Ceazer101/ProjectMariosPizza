package com.company;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String input;
    private Controller controller;
    private ActiveOrder activeOrder = new ActiveOrder();

    public UserInterface() {
        this.controller = new Controller();
    }


    public void userOptions() {
        System.out.println("Du kan taste følgende kommandoer: ");
        System.out.println("'o' for at oprette ordre\n'r' for at rette din ordre\n'g' for at gemme ordrehistorik\n'a' for at afslutte en ordre" +
                "\n's' for at se bestillingsoversigt\n'm' for at se menuen\n'e' for exit");


        boolean running = true;
        while (running) {
            input = scanner.next().trim().toLowerCase();
            switch(input) {
                case "opret", "o":
                    orderInterface();
                    break;

                case "ret" , "r":

                    break;

                case "gem", "g":

                    break;

                case "afslut", "a":

                    break;

                case "se", "s":

                    break;

                case "menu", "m":
                    controller.seeMenu();
                    break;

                case "exit", "e":
                    running = false;
                    break;

                default:
                    System.out.println("Det forstod vi ikke helt, prøv at indtast en ny kommando.");
                    break;
            }
        }
    }

   public void orderInterface(){
       //Asks user for ordernumber and saves it in a variable
       System.out.println("Indtast venligst ordrenummer: ");
       int orderNumber = scanner.nextInt();

       //prints the menu
       controller.seeMenu();

       //asks the user for pizza name
       System.out.println("indtast venligst nummer på den pizza der skal tilføjes: ");
       boolean notDone = true;
       Order newOrder = new Order();
       newOrder.setOrderNumber(orderNumber);
       while(notDone){
           //saves pizza name in variable
           int userInput = scanner.nextInt();

           //if the user types "done", the loops ends
           // if the user does not enter "done", then you will keep adding to the order
           if (userInput == 0){
               notDone = false;
           } else {
               // if(userInput.equals())
               newOrder.addPizza(controller.findPizza(userInput));
           }
       }
       activeOrder.addOrder(newOrder);
       for (Order order: activeOrder.getOrders() ){
           System.out.println(order.getOrderNumber());
           for (Pizza pizza : order.getPizzas()) {
               System.out.print(pizza.getNumber() + "  ");
               System.out.println(pizza.getName());
           }
       }

   }


}
