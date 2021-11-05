package com.company;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private int orderNumber;

    public Order(int orderNumber, ArrayList<Pizza> list){
       this.orderNumber = orderNumber;
       this.pizzas = list;
    }

    public Order() {
    }

    public void addPizza(Pizza pizza){
       pizzas.add(pizza);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

}
