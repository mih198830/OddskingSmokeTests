package com.oddsking.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement loginModule = $("#Login.username");

    public LoginPage loginModuleExist() {
        loginModule.exists();
        return this;
    }
}
