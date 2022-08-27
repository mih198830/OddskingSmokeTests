package com.sharpgaming.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VacanciesPage {
    SelenideElement vacanciesBlock = $("#recruitee-careers .rt-body.rt-theme-light");

    public VacanciesPage vacanciesBlockCheckIsVisible() {
        vacanciesBlock.shouldBe(visible);;
        return this;
    }
}
