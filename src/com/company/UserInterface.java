package com.company;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);


    public String readUserInput() {
        //Prints the different commands the user can write.
        System.out.println();
        System.out.println("Du kan taste følgende kommandoer: ");
        System.out.println("'o' for at oprette en bestilling\n'r' for at rette en bestilling\n'g' for at gemme alle aktive bestillinger" +
                "\n'a' for at afslutte programmet\n's' for at se bestillingsoversigt\n'm' for at se menuen\n");

        //Saves the userInput in variable.
        return scanner.next().trim().toLowerCase();
    }

    public void printMessage(String messsage) {
        System.out.println(messsage);
    }

    public int getPizzaNumber() {
        return scanner.nextInt();
    }
}

