package com.sharpgaming.tests;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    String funnyName = faker.funnyName().name();
}
