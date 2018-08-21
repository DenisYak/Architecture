package fabric_method;

//    конкретная фабрика

public class CorporateOrder extends Order{

    @Override
    public Client createClient() {
        return new CorporateClient();
    }
}
