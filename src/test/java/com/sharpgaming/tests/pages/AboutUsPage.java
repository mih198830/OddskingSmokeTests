package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage {
    SelenideElement emailAddress = $(By.linkText("info@sharpgaming.com"));

    public AboutUsPage emailAddress() {
        emailAddress.exists();
        return this;
    }
}
