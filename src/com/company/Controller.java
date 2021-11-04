package com.company;

public class Controller {

    private Menu MENU;

    public Controller(){
        MENU = new Menu();
    }

    public void start(){

    }

    public String seeMenu(){
        return MENU.toString();
    }

    public Pizza findPizza(int userInput){
        return MENU.findPizza(userInput);
    }

}





