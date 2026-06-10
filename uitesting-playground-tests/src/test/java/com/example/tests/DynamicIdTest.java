package com.example.tests;

import com.example.pages.DynamicIdPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Dynamic ID")
public class DynamicIdTest extends BaseTest {

    @Test
    @Description("Клик по кнопке с динамическим ID через поиск по тексту")
    public void testDynamicId() {
        DynamicIdPage page = new DynamicIdPage(driver);
        assertTrue(page.isButtonDisplayed(), "Кнопка не найдена");
        page.clickDynamicButton();
        takeScreenshot("dynamic-id-clicked");
    }
}