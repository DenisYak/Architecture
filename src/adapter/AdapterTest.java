package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        PBank pbank = new PBank();
        pbank.getBalance();
        ABank abank = new ABank();
        PBankAdapter pbankAdapter = new PBankAdapter(abank);
        pbankAdapter.getBalance();

    }

}
