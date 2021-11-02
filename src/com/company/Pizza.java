package com.company;

public class Pizza {
    private int number;
    private String name;
    private String ingridiens;
    private int price;

    public Pizza (int number, String name, String ingridiens, int price){
        this.name = name;
        this.ingridiens = ingridiens;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getIngridiens() {
        return ingridiens;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return number + ". " + name + ", " + ingridiens + ": " + price;
    }
}
