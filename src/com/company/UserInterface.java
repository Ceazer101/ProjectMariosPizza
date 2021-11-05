package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String input;
    private Controller controller;


    public UserInterface() {
        this.controller = new Controller();
    }


    public void userOptions() throws IOException {

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("Du kan taste følgende kommandoer: ");
            System.out.println("'o' for at oprette en bestilling\n'r' for at rette en bestilling\n'g' for at gemme alle aktive bestillinger" +
                    "\n'a' for at afslutte programmet\n's' for at se bestillingsoversigt\n'm' for at se menuen\n");
            input = scanner.next().trim().toLowerCase();
            switch(input) {
                case "opret", "o":
                    orderInterface();
                    break;

                case "ret" , "r":
                    //TODO: laves kun hvis der er tid
                    break;

                case "gem", "g":
                    controller.saveOrder();
                    break;

                case "afslut", "a":
                    controller.saveOrder();
                    running = false;
                    break;

                case "se", "s":
                    controller.listOfActiveOrders();
                    break;

                case "menu", "m":
                    controller.seeMenu();
                    break;

                default:
                    System.out.println("Det forstod vi ikke helt, prøv at indtast en ny kommando.");
                    break;
            }
        }
    }

   public void orderInterface(){

       //prints the menu
       controller.seeMenu();

       //asks the user for pizza name
       System.out.println("indtast venligst nummer på den pizza der skal tilføjes (Slut bestilling med '0'): ");

       controller.createOrder();

   }

}
