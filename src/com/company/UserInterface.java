package com.company;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String input;
    Menu menu = new Menu();


    public void userOptions() {
        System.out.println("Du kan taste følgende kommandoer: ");
        System.out.println("'o' for at oprette ordre\n'r' for at rette din ordre\n'g' for at gemme ordrehistorik\n'a' for at afslutte en ordre" +
                "\n's' for at se bestillingsoversigt\n'm' for at se menuen\n'e' for exit");


        boolean running = true;
        while (running) {
            input = scanner.next().trim().toLowerCase(Locale.ROOT);
            switch(input) {
                case "opret", "o":

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
                    System.out.println(menu.toString());
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

}
