package com.company;

public class Main {
    public static Order order1;
    public static Order order2;

    public static void main(String[] args) {
        makeOrders();
    }

    static void makeOrders() {
        order1 = new CorporateOrder();
        order2 = new PrivateOrder();
    }
}
