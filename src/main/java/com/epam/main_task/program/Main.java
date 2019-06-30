package com.epam.main_task.program;

import com.epam.main_task.models.Order;
import com.epam.main_task.scan.Scan;
import com.epam.main_task.messages.MessageKeys;
import com.epam.main_task.messages.PizzaMessages;

public class Main {
    public static void main(String[] args) {

/*
        Scan scan = new Scan();
        int kindsAmount = scan.scanOfKindsAmount();
        Order orderOne = new Order(10001, 1001, kindsAmount);
        for (int i = 0; i < kindsAmount; i++) {
            orderOne.getPizza()[i].setPizzaType(scan.scanOfPizzaType());
            orderOne.getPizza()[i].checkPizzaName(scan.scanOfString(), i + 1, 1001);
            int ingredientsAmount = scan.scanOfIngredientsAmount();
            orderOne.getPizza()[i].setIngredients(ingredientsAmount);
            for (int j = 0; j < ingredientsAmount; j++) {
                orderOne.getPizza()[i].addIngredient(j);
                if (orderOne.getPizza()[i].getIngredients().length == ingredientsAmount) {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.FULL));
                }

            }
            orderOne.getPizza()[i].setAmount(scan.scanOfPizzaAmount());
            System.out.println(PizzaMessages.getMessage(MessageKeys.AMOUNT_CHANGE));
            if (scan.scanOfAmountChange() == 1) {
            } else {
                orderOne.getPizza()[i].setAmount(scan.scanOfPizzaAmount());
            }
            orderOne.getPizza()[i].setPrice(ingredientsAmount);
            orderOne.getPizza()[i].setSumOfPizza();
        }
        orderOne.setSumOfOrder(kindsAmount);
        System.out.println(orderOne);
       */

        Order orderOne = new Order(10001, 7717, 2);
        orderOne.getPizza()[0].setPizzaType("Pizza base (Calzone)");
        orderOne.getPizza()[0].checkPizzaName("Margarita", 1, 1001);
        int ingredientsAmount = 4;
        orderOne.getPizza()[0].setIngredients(ingredientsAmount);
        orderOne.getPizza()[0].addIngredient(0, "Tomato Paste");
        orderOne.getPizza()[0].addIngredient(1, "Pepper");
        orderOne.getPizza()[0].addIngredient(2, "Garlic");
        orderOne.getPizza()[0].addIngredient(3, "Bacon");
        orderOne.getPizza()[0].setAmount(2);
        orderOne.getPizza()[0].setPrice(ingredientsAmount);
        orderOne.getPizza()[0].setSumOfPizza();
        orderOne.getPizza()[1].setPizzaType("Pizza base");
        orderOne.getPizza()[1].checkPizzaName("Margarita", 1, 1001);
        ingredientsAmount = 4;
        orderOne.getPizza()[1].setIngredients(ingredientsAmount);
        orderOne.getPizza()[1].addIngredient(0, "Tomato Paste");
        orderOne.getPizza()[1].addIngredient(1, "Cheese");
        orderOne.getPizza()[1].addIngredient(2, "Salami");
        orderOne.getPizza()[1].addIngredient(3, "Olives");
        orderOne.getPizza()[1].setAmount(3);
        orderOne.getPizza()[1].setPrice(ingredientsAmount);
        orderOne.getPizza()[1].setSumOfPizza();
        orderOne.setSumOfOrder(2);
        System.out.println(orderOne);

        Order orderTwo = new Order(10002, 4372, 1);
        orderTwo.getPizza()[0].setPizzaType("Pizza base");
        orderTwo.getPizza()[0].checkPizzaName("BasePZZ", 1, 1001);
        ingredientsAmount = 0;
        orderTwo.getPizza()[0].setIngredients(ingredientsAmount);
        orderTwo.getPizza()[0].setAmount(12);
        orderTwo.getPizza()[0].setPrice(ingredientsAmount);
        orderTwo.getPizza()[0].setSumOfPizza();
        orderTwo.setSumOfOrder(1);
        System.out.println(orderTwo);
    }
}
