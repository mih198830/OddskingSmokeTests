package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class AboutUsPage {

    SelenideElement emailAddress = $(By.partialLinkText("info@sharpgaming.com"));

    public AboutUsPage emailAddress() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        emailAddress.shouldHave(href("mailto:info@sharpgaming.com"));
        return this;
    }
}
