package adapter;

//    адаптер

public class AdapterTest {
    public static void main(String[] args) {
        CThermometer cthermometer = new CThermometer();
        System.out.println("Показания C термометра = " + cthermometer.getIndication());

        CThermAdapt cthermAdapt = new CThermAdapt(new FThermometer());
        System.out.println("Показания F термометра = " + cthermAdapt.getIndication());

    }

}
