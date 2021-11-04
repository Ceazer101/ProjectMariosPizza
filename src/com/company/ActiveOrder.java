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

    @Override
    public String toString() {
        return "ActiveOrder{" +
                "orders=" + orders +
                '}';
    }
}
