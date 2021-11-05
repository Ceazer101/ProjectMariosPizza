package com.company;

import java.util.ArrayList;

public class ActiveOrder {
    private ArrayList<Order> orders = new ArrayList<>();

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

    @Override
    public String toString() {
        return "ActiveOrder{" +
                "orders=" + orders +
                '}';
    }
}
