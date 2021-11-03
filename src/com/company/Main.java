package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Test1;
        Menu menu = new Menu();
        UserInterface ui = new UserInterface();
        Order order = new Order();
        ui.userOptions();
        System.out.println(order.getOrderList());
       // System.out.println(menu);
    }
}
