package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem item1 = new GenericItem(1, "Tea", 36.50f);
        GenericItem item2 = new GenericItem(2, "Orange juice", 56.40f);
        GenericItem item3 = new GenericItem(3, "Americano", 60.00f);
        item1.printAll();
        item2.printAll();
        item3.printAll();
        FoodItem foodItem1 = new FoodItem(4, "Latte", 80.00f, new Date(), (short) 2);
        TechnicalItem technicalItem = new TechnicalItem(5, "iPhone SE", 400f, (short) 2);
        foodItem1.printAll();
        technicalItem.printAll();
        FoodItem foodItem2 = new FoodItem(6, "Cappuccino", 75.00f, new Date(), (short) 2);
        FoodItem foodItem3 = new FoodItem(7, "Espresso", 50.00f, new Date(), (short) 2);
        System.out.println(foodItem1.equals(foodItem3));
        System.out.println(foodItem1.equals(foodItem1.clone()));
        System.out.println(foodItem1.toString());
        foodItem3.analog = item2;
        System.out.println(foodItem3.analogClone().toString());
    }
}
