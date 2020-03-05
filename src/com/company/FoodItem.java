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

    public boolean equals(Object o){
        if (!(o instanceof FoodItem)) {
            return false;
        }
        return this == o;
    }



    FoodItem(Integer ID, String name, Float price, Date dateOfIncome, Short expires) {
        super(ID, name, price);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }
}
