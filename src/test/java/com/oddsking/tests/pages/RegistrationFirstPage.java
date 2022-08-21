package com.oddsking.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFirstPage {
    SelenideElement registrationFirstModule = $("[data-actionable='RegistrationPage.AccountSection'");

    public RegistrationFirstPage registrationFirstPageOpens() {
        registrationFirstModule.exists();
        return this;
    }
}
