package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends BasePage {
    @FindBy(name = "UserName")
    private WebElement userNameInput;

    @FindBy(name = "Password")
    private WebElement passwordInput;

    @FindBy(css = "button#login")
    private WebElement loginButton;

    @FindBy(css = "label#loginstatus")
    private WebElement loginStatusLabel;

    public SampleAppPage(WebDriver driver) {
        super(driver);
        driver.get("https://uitestingplayground.com/sampleapp");
    }

    public void login(String username, String password) {
        wait.until(d -> userNameInput.isDisplayed());
        userNameInput.clear();
        userNameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getLoginStatus() {
        return loginStatusLabel.getText();
    }
}