package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
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
        step("Open url 'https://www.oddsking.com/'", () ->
                open("https://www.oddsking.com/"));

        step("Click search field", () -> {
            $("[data-actionable='GameSearch.Trigger.Open']").click();
        });

        step("Print \"game\" text into \"Search for a game\" text field", () -> {
            $("[data-actionable='GameSearch.Searcher.Input']").setValue("game");
        });

        step("game search results appears", () -> {
            $(withTagAndText("p","games found for you...")).shouldBe(Condition.visible);
        });
    }

    @Test
    @Description("Site has title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.oddsking.com/'", () ->
            open("https://www.oddsking.com/"));

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
        step("Open url 'https://www.oddsking.com/'", () ->
            open("https://www.oddsking.com/"));

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
        step("Open url 'https://www.oddsking.com/'", () ->
                open("https://www.oddsking.com/"));

        step("Click registration button", () -> {
            $("[data-actionable='Header.LoggedOut.buttonJoin'],[href='registration']").click();
        });

        step("registration module appears", () -> {
            $("[data-actionable='RegistrationPage.AccountSection'").exists();
        });
    }

    @Test
    @Description("Login module should open")
    @DisplayName("Login page opens and available")
    void loginModuleTest() {
        step("Open url 'https://www.oddsking.com/'", () ->
                open("https://www.oddsking.com/"));

        step("Click login button", () -> {
            $("[data-actionable='Header.LoggedOut.buttonLogin']").click();
        });

        step("login module appears", () -> {
            $("#Login.username").exists();
        });
    }
}