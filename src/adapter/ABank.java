package adapter;

public class ABank {
    private int balance;
    public ABank(){
        balance = 200;
    }
    public void getBalance() {
        System.out.println("ABank balance = " + balance);
    }
}
