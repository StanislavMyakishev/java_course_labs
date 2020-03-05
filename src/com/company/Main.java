package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[3];
        float lowBorder = 0;
        float highBorder = 10;
        Random random = new Random();
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = lowBorder + (highBorder - lowBorder) * random.nextFloat();
        }
        NumberArray<Integer> intArray = new NumberArray<>(intArr);
        NumberArray<Float> floatArray = new NumberArray<>(floatArr);

        System.out.println(intArray.sum());
        System.out.println(floatArray.sum());

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld;
        item_fld = line.split(";");
        System.out.println(Arrays.toString(item_fld));
        FoodItem foodItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItem.printAll();
    }
}
