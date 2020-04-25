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
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
    }
}
