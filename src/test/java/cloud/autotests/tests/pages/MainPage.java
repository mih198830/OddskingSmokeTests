package cloud.autotests.tests.pages;

import com.codeborne.selenide.SelenideElement;
import jdk.tools.jmod.Main;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement joinButton = $("[data-actionable='Header.LoggedOut.buttonJoin'],[href='registration']");
    SelenideElement loginButton = $("[data-actionable='Header.LoggedOut.buttonLogin']");


    public MainPage joinButtonClick() {
        joinButton.click();
        return this;
    }

    public MainPage loginButtonCLick() {
        loginButton.click();
        return this;
    }
}
