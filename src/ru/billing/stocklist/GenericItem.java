package ru.billing.stocklist;

public class GenericItem implements Cloneable {
    private int ID;
    private static int currentID;
    private String name;
    private float price;
    private GenericItem analog = null;
    private Category category = Category.GENERAL;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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
