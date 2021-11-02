package com.company;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String input;


    public void userOptions() {
        System.out.println("Du kan taste følgende kommandoer: ");
        System.out.println("'o' for at oprette ordre\n'm' for at se menu\n's' for at se bestillingsoversigt" +
                "\n'a' for at afslutte en ordre\n'g' for at gemme ordrehistorik");


        while (true) {
            input = scanner.next().trim().toLowerCase(Locale.ROOT);
            switch(input) {
                case "opret", "o":

                    break;

                case "menu", "m":

                    break;

                case "se", "s":

                    break;

                case "afslut", "a":

                    break;

                case "gem", "g":

                    break;

                default:
                    System.out.println("Det forsod vi ikke helt, prøv at indtast en ny kommando.");
                    break;
            }
        }
    }



}
