package com.example.tests;

import com.example.pages.SampleAppPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Sample App")
public class SampleAppTest extends BaseTest {

    @Test
    @Description("Проверка успешного логина с валидными данными")
    public void testSuccessfulLogin() {
        SampleAppPage sampleApp = new SampleAppPage(driver);
        sampleApp.login("TestUser", "pwd");
        String status = sampleApp.getLoginStatus();
        assertTrue(status.contains("Welcome"), "Login failed: " + status);
        takeScreenshot("sample-app-success");
    }
}