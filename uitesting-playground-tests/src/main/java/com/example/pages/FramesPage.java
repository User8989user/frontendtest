package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/frames");
    }

    public void clickButtonInsideFrame() {
        // Ждём, пока фрейм станет доступен для переключения
        wait.until(d -> {
            try {
                d.switchTo().frame("frame1");
                return true;
            } catch (Exception e) {
                return false;
            }
        });
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-primary")));
        button.click();
        driver.switchTo().defaultContent();
    }

    public String getButtonTextInsideFrame() {
        wait.until(d -> {
            try {
                d.switchTo().frame("frame1");
                return true;
            } catch (Exception e) {
                return false;
            }
        });
        String text = driver.findElement(By.cssSelector("button.btn-primary")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}