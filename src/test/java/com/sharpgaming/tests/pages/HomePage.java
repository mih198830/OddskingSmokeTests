package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    SelenideElement cookieButton = $(".sqs-cookie-banner-v2-acceptWrapper");
    SelenideElement aboutUsLink = $(withTagAndText("a","About us"));
    SelenideElement whatWeDo = $(withTagAndText("a","What we do"));

        public HomePage cookieButtonCLick() {
        cookieButton.click();
        return this;
    }

    public HomePage aboutUsLinkClick() {
        aboutUsLink.click();
        return this;
    }

    public HomePage whatWeDoLinkClick() {
        whatWeDo.click();
        return this;
    }
}