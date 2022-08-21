package cloud.autotests.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement joinButton = $("[data-actionable='Header.LoggedOut.buttonJoin'],[href='registration']");

    public MainPage joinButtonClick(){
        joinButton.click();
        return this;
    }
}
