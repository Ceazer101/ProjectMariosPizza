package com.company;

public class Pizza {

    //Attributes.
    private int number;
    private String name;
    private String ingredients;
    private int price;

    //Constructor.
    public Pizza(int number, String name, String ingredients, int price) {
        this.number = number;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "nr " + number + ". " + name + ", " + ingredients + ": " + price + "kr.";
    }

}
