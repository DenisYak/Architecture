package fabric_method;

//реализация паттерна фабричный метод

public class Main {
    private static Order order1;
    private static Order order2;

    public static void main(String[] args) {
        makeOrders();
        order1.createClient().raiting();
        order2.createClient().raiting();
    }

    private static void makeOrders() {
        order1 = new CorporateOrder();
        order2 = new PrivateOrder();
    }
}
