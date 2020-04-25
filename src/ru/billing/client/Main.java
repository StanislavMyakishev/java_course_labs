package ru.billing.client;

import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

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
