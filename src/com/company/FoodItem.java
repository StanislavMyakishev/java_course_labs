package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {
    public Date dateOfIncome;
    public Short expires;

    @Override
    void printAll() {
        System.out.printf("ID: %d, Name: %-2s, price: %5.2f, analog: %-2s, category: %-2s, date of Income: %-2s, expires: %-2s\n",
                ID, name, price, analog, category, dateOfIncome, expires);
    }

    public boolean equals(Object o) {
        if (!(o instanceof FoodItem)) {
            return false;
        }
        return this == o;
    }

    public FoodItem(String name, float price, FoodItem analog, Date
            date, short expires) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 100, null, new Date(), (short) 2);
    }
}
