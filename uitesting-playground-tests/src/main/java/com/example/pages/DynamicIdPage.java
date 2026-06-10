package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicIdPage extends BasePage {
    public DynamicIdPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/dynamicid");
    }

    public void clickDynamicButton() {
        WebElement button = wait.until(d -> d.findElement(By.xpath("//button[contains(text(),'Button with Dynamic ID')]")));
        button.click();
    }

    public boolean isButtonDisplayed() {
        return driver.findElements(By.xpath("//button[contains(text(),'Button with Dynamic ID')]")).size() > 0;
    }
}