package com.DSN.locators;

import org.openqa.selenium.By;

public enum HelloFreshLocators {
    PLANS_LOCATOR(By.id("homeBannerCTA")),                              // ("//span[@id='main-navigation']/a[1]")),
    LOGIN_BUTTON_LOCATOR_2(By.xpath("//button[@class='fela-13mqkcm']/span")), //button[@class='fela-13mqkcm']/span
    LOGIN_BUTTON_LOCATOR(By.id("login-button")),
    EMAIL_LOCATOR(By.id("email-input")),
    PASSWORD_LOCATOR(By.id("password-input")),
    SUBMIT_BUTTON_LOCATOR(By.id("submit-login-button")),
    INCORRECT_MESSAGE_LOCATOR(By.xpath("//small[@class='text-danger']")),    //(By.cssSelector("#authModal > div > div > div > span > hf-login > form > div.modal-body > small"));
    SUBSCRIBE_MESSAGE_LOCATOR(By.xpath("//div[@class='row']//span"));

    private By locator;

    HelloFreshLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator(){
        return locator;
    }


}
