package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VisibilityPage extends BasePage {
    @FindBy(id = "hideButton")
    private WebElement hideButton;

    @FindBy(id = "removedButton")
    private WebElement removedButton;

    @FindBy(id = "visibleButton")
    private WebElement visibleButton;

    public VisibilityPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/visibility");
    }

    public void hideRemovedButton() {
        hideButton.click();
    }

    public boolean isRemovedButtonDisplayed() {
        try {
            return removedButton.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isVisibleButtonDisplayed() {
        return visibleButton.isDisplayed();
    }
}