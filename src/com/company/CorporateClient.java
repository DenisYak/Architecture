package com.company;

public class CorporateClient implements Client{
    String name;
    String address;

    @Override
    public void raiting() {
        System.out.println("У меня высокий рейтинг");
    }
}
