package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ItemCatalog itemCatalog = new ItemCatalog();
        for (int i = 0; i < 10000; i++) {
            itemCatalog.addItem(new GenericItem());
        }
        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            itemCatalog.findItemByID(1001);
        }
        long end = new Date().getTime();
        System.out.println("HASH MAP: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            itemCatalog.findItemByIDAL(1001);
        }
        end = new Date().getTime();
        System.out.println("ARRAY LIST: " + (end - begin));
    }
}
