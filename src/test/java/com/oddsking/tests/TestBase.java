package com.oddsking.tests;

import com.oddsking.config.Project;
import com.oddsking.helpers.AllureAttachments;
import com.oddsking.helpers.DriverSettings;
import com.oddsking.helpers.DriverUtils;
import com.oddsking.tests.pages.LoginPage;
import com.oddsking.tests.pages.MainPage;
import com.oddsking.tests.pages.RegistrationFirstPage;
import com.oddsking.tests.pages.SearchPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.open;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    TestData testData = new TestData();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    RegistrationFirstPage registrationFirstPage = new RegistrationFirstPage();
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void beforeAll() {
        DriverSettings.configure();
    }

    @BeforeEach
    public void openPage() {
        Selenide.open("https://www.oddsking.com/");
    }
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }
}
