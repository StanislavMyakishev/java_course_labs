package com.company;

public class TechnicalItem extends GenericItem {
    public Short warrantyTime;

    @Override
    void printAll() {
        System.out.printf("ID: %d, Name: %-2s, price: %5.2f, analog: %-2s, category: %-2s, warranty (days): %-2s\n",
                ID, name, price, analog, category, warrantyTime);
    }

    public boolean equals(Object o) {
        if (!(o instanceof TechnicalItem)) {
            return false;
        }
        return this == o;
    }

    TechnicalItem(Integer ID, String name, Float price, Short warrantyTime) {
        super(ID, name, price);
        this.warrantyTime = warrantyTime;
    }
}
