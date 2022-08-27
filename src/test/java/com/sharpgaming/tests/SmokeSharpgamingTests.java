package com.sharpgaming.tests;

import com.sharpgaming.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SmokeSharpgamingTests extends TestBase {
    @Test
    @Description("Check that email link exist on the About Us page")
    @DisplayName("About us page email linktest")
    void generatedTest() {


        step("Click About Us Link", () -> {
            homePage.aboutUsLinkClick();
        });

        step("Click arrow icon to scroll management team", () -> {
            aboutUsPage.emailAddress();
        });
    }
}