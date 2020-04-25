package com.company;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader{
    @Override
    public void load(ItemCatalog itemCatalog) {
        GenericItem item1 = new GenericItem("SONY TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short)10);
        itemCatalog.addItem(item1);
        itemCatalog.addItem(item2);
    }
}
