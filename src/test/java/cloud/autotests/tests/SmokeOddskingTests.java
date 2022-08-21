package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.tests.pages.LoginPage;
import cloud.autotests.tests.pages.MainPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SmokeOddskingTests extends TestBase {
    @Test
    @Description("Testing game search functionality")
    @DisplayName("Game search working")
    void generatedTest() {
        step("Click search field", () -> {
            mainPage.searchFieldClick();
        });

        step("Print \"game\" text into \"Search for a game\" text field", () -> {
            searchPage.searchPageSetValue("abc");
        });

        step("game search results appears", () -> {
            searchPage.searchRestulsTextVisible();
        });
    }

    @Test
    @Description("Site has title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'OddsKing - Play popular arcade gambling games online at OddsKing'", () -> {
            String expectedTitle = "OddsKing - Play popular arcade gambling games online at OddsKing";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Severe errors are not in browser console")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Registration module should open")
    @DisplayName("Registration page opens and available")
    void registrationModuleTest() {
        step("Click registration button", () -> {
                mainPage.joinButtonClick();
        });
        step("registration module appears", () -> {
            registrationFirstPage.registrationFirstPageOpens();
        });
    }

    @Test
    @Description("Login module should open")
    @DisplayName("Login page opens and available")
    void loginModuleTest() {
        step("Click login button", () -> {
            mainPage.loginButtonCLick();
        });
        step("login module appears", () -> {
            loginPage.loginModuleExist();
        });
    }
}