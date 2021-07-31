package controller;


import common.Exception.MyException;

public class Main {

    public static void main(String[] args) throws MyException{
        try {
            MainController mainController = new MainController();
            mainController.displayMainMenu();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
