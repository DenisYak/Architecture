package com.company;

public class PrivateClient implements Client{
    String name;
    String address;

    @Override
    public void raiting() {
        System.out.println("У меня низкий рейтинг");
    }
}
