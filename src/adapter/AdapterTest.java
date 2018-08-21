package adapter;

//    адаптер

public class AdapterTest {
    public static void main(String[] args) {
        CThermometer cthermometer = new CThermometer();
        cthermometer.getIndication();
        CThermometerAdapter cthermometerAdapter = new CThermometerAdapter(new FThermometer());
        cthermometerAdapter.getIndication();
    }

}
