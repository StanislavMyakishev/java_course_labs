package com.company;

public class GenericItem implements Cloneable {
    public int ID;
    static int currentID;
    public String name;
    public float price;
    public GenericItem analog = null;
    public Category category = Category.GENERAL;

    void printAll() {
        System.out.printf("ID: %d, Name: %-2s, price: %5.2f, analog: %-2s, category: %-2s \n",
                ID, name, price, analog, category);
    }

    public boolean equals(Object o) {
        if (!(o instanceof GenericItem)) {
            return false;
        }
        return this == o;
    }

    public Object clone() throws
            CloneNotSupportedException {
        GenericItem item = (GenericItem) super.clone();
        item.analog = (GenericItem) analog.clone();
        item.category = category;
        return item;
    }

    public Object analogClone() throws CloneNotSupportedException {
        return this.analog.clone();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + this.ID;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }
}
