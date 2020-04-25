package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;

public class Main {
    public static void main(String[] args) throws CatalogLoadException {
        String filename = "/Users/stas/IdeaProjects/Lab2/src/ru/billing/client/items.txt";
        ItemCatalog catalog = new ItemCatalog();
        CatalogFileLoader fileLoader = new CatalogFileLoader(filename);
        fileLoader.load(catalog);
        System.out.println(catalog);
    }
}
