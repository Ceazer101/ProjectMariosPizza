package com.company;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Pizza> orderList = new ArrayList<>();
    private int orderNumber;

   public Order(int orderNumber, String name){
       this.orderNumber = orderNumber;
       this.name = name;
   }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }

  /*public Pizza addOrder(int orderNumber, Pizza name){
       orderList.add(orderNumber, name);
       return pizza;
   }*/

   /* public ArrayList<Pizza> getOrderList() {
        return orderList;
    }*/
}
