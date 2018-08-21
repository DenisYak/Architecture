package adapter;

public class CThermometer {
    private double indication;
    public CThermometer(){
        indication = 36.6;
    }
    public void getIndication() {
        System.out.println("Показания С термометра = " + indication);
    }
}
