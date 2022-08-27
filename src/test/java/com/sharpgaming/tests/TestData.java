package com.sharpgaming.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    Faker faker = new Faker(new Locale("GB"));

    String funnyName = faker.funnyName().name();
    String email = faker.internet().emailAddress();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
}
