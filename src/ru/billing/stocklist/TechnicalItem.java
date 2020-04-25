package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private Short warrantyTime;

    public Short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(Short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        int ID = super.getID();
        String name = super.getName();
        float price = super.getPrice();
        GenericItem analog = getAnalog();
        Category category = getCategory();
        System.out.printf("ID: %d, Name: %-2s, price: %5.2f, analog: %-2s, category: %-2s, warranty (days): %-2s\n",
                ID, name, price, analog, category, warrantyTime);
    }

    public boolean equals(Object o) {
        if (!(o instanceof TechnicalItem)) {
            return false;
        }
        return this == o;
    }
}
