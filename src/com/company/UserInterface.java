package com.company;
import java.util.Locale;
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
       System.out.println("Indtast venligst ordrenummer: ");
       int orderNumber = scanner.nextInt();

       controller.seeMenu();
       System.out.println("indtast venligst navn på den pizza der skal tilføjes: ");
       boolean done = true;
       while(done){
           String userInput = scanner.next().trim().toLowerCase();
           controller.createOrder(userInput);
       }
       scanner.next();
   }


}
