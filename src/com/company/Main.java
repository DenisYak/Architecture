package com.company;

//реализация паттерна фабричный метод

public class Main {
    public static Order order1;
    public static Order order2;

    public static void main(String[] args) {
        makeOrders();
        order1.createClient().raiting();
        order2.createClient().raiting();
    }

    static void makeOrders() {
        order1 = new CorporateOrder();
        order2 = new PrivateOrder();
    }
}
