package com.company;

public class PrivateOrder extends Order{
    @Override
    public Client createClient() {
        return new PrivateClient();
    }
}
