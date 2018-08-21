package adapter;

public class CThermometerAdapter extends CThermometer {
    private FThermometer fthermometer;
    public CThermometerAdapter (FThermometer fthermometer) {
        this.fthermometer = fthermometer;

    }
    public void getIndication() {
        fthermometer.getIndication();
    }
}
