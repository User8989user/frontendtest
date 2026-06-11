package com.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickPage extends BasePage {
    @FindBy(id = "badButton")
    private WebElement badButton;

    public ClickPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/click");
    }

    public void clickWithJavaScript() {
        wait.until(ExpectedConditions.elementToBeClickable(badButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", badButton);
    }

    public boolean isButtonSuccess() {
        // Ждём, пока класс изменится на btn-success
        return wait.until(d -> badButton.getAttribute("class").contains("btn-success"));
    }
}