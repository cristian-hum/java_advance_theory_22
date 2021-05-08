package com.sda.coding.ex2;

public class Quantity {
    private int qty;

    public Quantity(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void increaseQty(int add) {
        this.qty += add;
    }

    public void decreaseQty(int subtract) {
        if (subtract <= qty) {
            this.qty -= subtract;
            System.out.printf("Quantity decreased by %s, to %s pcs \n", subtract, qty);
        } else {
            System.out.printf("Insufficient quantity, please subtract less than %s", qty);
        }
    }
}
