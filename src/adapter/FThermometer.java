package adapter;

public class FThermometer {
    private double indication;
    public FThermometer(){
        indication = 97.88;
    }
    public void getIndication() {
        System.out.println("Показания F термометра = " + indication);
    }
}
