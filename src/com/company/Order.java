package com.company;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();
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

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public void showActiveOrders(){

        for (Order order: getOrders() ){
            System.out.println("(" + order.getOrderNumber() + ")");
            for (Pizza pizza : order.getPizzas()) {
                System.out.print(pizza.getNumber() + "  ");
                System.out.println(pizza.getName());
            }
        }
    }

    public String makeStringPizzaName(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            stringBuilder.append(pizza.getNumber()).append(" ");
            stringBuilder.append(pizza.getName()).append(" ");
        }
        return stringBuilder.toString();
    }

    public void clearOrders(){
        orders.clear();
    }

}
