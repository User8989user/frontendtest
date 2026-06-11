package com.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickPage extends BasePage {
    @FindBy(id = "badButton")
    private WebElement badButton;

    public ClickPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/click");
    }

    public void clickWithJavaScript() {
        wait.until(d -> badButton.isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", badButton);
    }

    public String getButtonClass() {
        return badButton.getAttribute("class");
    }
}