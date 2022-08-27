package com.sharpgaming.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WhatWeDoPage {
    SelenideElement searchInput = $("[data-actionable='GameSearch.Searcher.Input']");
    SelenideElement searchResultsText = $("._1ensqhg");

    public WhatWeDoPage searchPageSetValue(String value) {
        searchInput.setValue(value);
        return this;
    }

    public WhatWeDoPage searchRestulsTextVisible() {
        searchResultsText.shouldBe(Condition.visible);
        return this;
    }
}
