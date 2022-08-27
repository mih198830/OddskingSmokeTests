package com.sharpgaming.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class SmokeSharpgamingTests extends TestBase {
    @Test
    @Description("Check that email link exist on the About Us page")
    @DisplayName("Email link test - About us page ")
    void emailLinkTest() {

        step("Click About Us Link", () -> {
            homePage.aboutUsLinkClick();
        });

        step("Check email address is present on the About Us page", () -> {
            aboutUsPage.emailAddress();
        });
    }

    @Test
    @Description("Open What we Do page and click Vacancies button")
    @DisplayName("Open What we Do page and open Vacancies")
    void checkVacanciesFromWhatWePage() {
        step("Click What we do Link", () -> {
            homePage.whatWeDoLinkClick();
        });

        step("Click Vacancies from What we do page", () -> {
            whatWeDoPage.vacanciesButtonClick();
            vacanciesPage.vacanciesBlockCheckIsVisible();
        });
    }


    @Test
    @Description("Open What we Do page and click Vacancies button")
    @DisplayName("Open What we Do page and open Vacancies")
    void generatedTest() {
        step("Click What we do Link", () -> {
            homePage.whatWeDoLinkClick();
        });

        step("Check email address is present on the About Us page", () -> {
            whatWeDoPage.vacanciesButtonClick();
        });
    }
}