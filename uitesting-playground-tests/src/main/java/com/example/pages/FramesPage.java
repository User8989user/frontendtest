package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/frames");
    }

    public void clickButtonInsideNestedFrame() {
        // Переключаемся во внешний фрейм
        driver.switchTo().frame("frame1");
        // Во внешнем фрейме ищем внутренний фрейм по имени
        driver.switchTo().frame("frame1");
        // Теперь внутри внутреннего фрейма можно кликнуть по кнопке
        WebElement button = wait.until(d -> d.findElement(By.cssSelector("button.btn-primary")));
        button.click();
        // Возвращаемся к основному содержимому
        driver.switchTo().defaultContent();
    }

    public String getButtonTextInsideFrame() {
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.cssSelector("button.btn-primary")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}