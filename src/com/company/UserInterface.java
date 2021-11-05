package com.company;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String input;
    private Controller controller;


    public UserInterface() {
        this.controller = new Controller();
    }


    public void userOptions() {
        System.out.println("Du kan taste følgende kommandoer: ");
        System.out.println("'o' for at oprette en bestilling\n'r' for at rette en bestilling\n'g' for at gemme alle aktive bestillinger" +
                "\n'a' for at afslutte en færdig bestilling\n's' for at se bestillingsoversigt\n'm' for at se menuen\n'e' for exit");

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
                    controller.listOfActiveOrders();
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
       controller.createOrder(orderNumber);

   }


}
