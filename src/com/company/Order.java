package com.company;

import java.util.ArrayList;

public class Order {
    private ArrayList<Pizza> orderList = new ArrayList<>();
    private int orderNumber;

   public Order(int orderNumber){
       this.orderNumber = orderNumber;
   }

   public void addOrder(Pizza pizza){
       orderList.add(pizza);
   }






}
