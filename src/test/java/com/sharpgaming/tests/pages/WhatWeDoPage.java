package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WhatWeDoPage {
    SelenideElement vacanciesButton = $(By.linkText("FIND OUT MORE"));


    public WhatWeDoPage vacanciesButtonClick() {
        vacanciesButton.click();
        return this;
    }
}
