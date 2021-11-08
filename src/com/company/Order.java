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

    //Returns how many orders there are.
    public int numbersOfOrders(){
        return orders.size();
    }

}
