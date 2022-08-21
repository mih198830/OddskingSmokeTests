package cloud.autotests.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    SelenideElement searchInput = $("[data-actionable='GameSearch.Searcher.Input']");
    SelenideElement searchResultsText = $("._1ensqhg");

    public SearchPage searchPageSetValue(String value) {
        searchInput.setValue(value);
        return this;
    }

    public SearchPage searchRestulsTextVisible() {
        searchResultsText.shouldBe(Condition.visible);
        return this;
    }
}
