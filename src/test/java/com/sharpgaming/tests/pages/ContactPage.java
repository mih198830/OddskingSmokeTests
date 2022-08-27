package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {
    SelenideElement emailForm = $(By.name("email"));
    SelenideElement firstNameForm = $(By.name("fname"));
    SelenideElement lastNameForm = $(By.name("lname"));
    SelenideElement submitButton = $(byValue("Send"));

    public ContactPage emailFormPrint(String value) {
        emailForm.sendKeys(value);
        return this;
    }

    public ContactPage firstNameFormPrint(String value) {
        firstNameForm.sendKeys(value);
        return this;
    }

    public ContactPage lastNameFormPrint(String value) {
        lastNameForm.sendKeys(value);
        return this;
    }

    public ContactPage submitButtonClick() {
        submitButton.click();
        return this;
    }
}
