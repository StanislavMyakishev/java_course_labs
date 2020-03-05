package com.company;

public class NumberArray<T extends Number> {
    private T[] arrNums;

    public T[] get() {
        return this.arrNums;
    }

    public void set(T[] arrNums) {
        this.arrNums = arrNums;
    }

    public NumberArray(T[] numP) {
        this.set(numP);
    }

    public double sum() {
        double doubleWork = 0;
        for (T arrNum : arrNums) {
            doubleWork += arrNum.doubleValue();
        }
        return doubleWork;
    }
}
