package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
            wait.until(d -> removedButton.isDisplayed());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isVisibleButtonDisplayed() {
        return visibleButton.isDisplayed();
    }
}