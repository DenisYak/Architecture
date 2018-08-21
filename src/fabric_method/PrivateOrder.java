package fabric_method;

//    конкретная фабрика

public class PrivateOrder extends Order{

    @Override
    public Client createClient() {
        return new PrivateClient();
    }
}
