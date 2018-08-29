package adapter;

// адаптер переводит F градусы в C

public class CThermAdapt {
    private FThermometer fthermometer;
    public CThermAdapt (FThermometer fthermometer) {
        this.fthermometer = fthermometer;
    }

    public double getIndication() {
       return (fthermometer.getIndication()-32)/1.8;
    }
}
