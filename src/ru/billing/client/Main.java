package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

public class Main {
    public static void main(String[] args) throws ItemAlreadyExistsException, CatalogLoadException {
        ItemCatalog itemCatalog = new ItemCatalog();
        GenericItem analog = new GenericItem();
        for (int i = 0; i < 1; i++) {
            itemCatalog.addItem(new GenericItem("item", 20, Category.GENERAL, analog));
        }
        itemCatalog.addItem(new GenericItem("itemm", 20, Category.GENERAL, analog));
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
    }
}
