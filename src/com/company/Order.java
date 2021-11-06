package com.company;

import java.util.ArrayList;

public class Order {

    //Attributes.
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private int orderNumber = 1;

    //TODO: delete constructor if not used.
    public Order(int orderNumber, ArrayList<Pizza> list){
       this.orderNumber = orderNumber;
       this.pizzas = list;
    }

    //Overloading of constructor.
    public Order() {
    }

    //Adds 1 to orderNumber.
    public void orderCounter(){
        orderNumber++;
    }

    //Adds pizza.
    public void addPizza(Pizza pizza){
       pizzas.add(pizza);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    //Adds order(s).
    public void addOrder(Order order){
        orders.add(order);
    }

    //Prints the list of active orders.
    public void showActiveOrders(){

        //Loops through the list of orders and prints the order number.
        for (Order order: getOrders() ){
            System.out.println("(" + order.getOrderNumber() + ")");

            //Loops through the list of pizza's and prints the pizza number and pizza name.
            for (Pizza pizza : order.getPizzas()) {
                System.out.print(pizza.getNumber() + "  ");
                System.out.println(pizza.getName());
            }
        }
    }

    //Returns how many orders there are.
    public int numbersOfOrders(){
        return orders.size();
    }

    // TODO: ????
    // Makes a formatted string of pizza.
    public String makeStringPizzaName(){

        //Initializing a StringBuilder object.
        StringBuilder stringBuilder = new StringBuilder();

        //Loops through the list of pizza's.
        for (Pizza pizza : pizzas) {

            //Adds the pizza number.
            stringBuilder.append(pizza.getNumber()).append(" ");

            //Adds the name of the pizza.
            stringBuilder.append(pizza.getName()).append(" ");
        }
        return stringBuilder.toString();
    }

    //Clear order(s).
    public void clearOrders(){
        orders.clear();
    }
}
