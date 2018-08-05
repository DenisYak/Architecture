package com.company;

public class CorporateOrder extends Order{

    @Override
    public Client createClient() {
        return new CorporateClient();
    }
}
