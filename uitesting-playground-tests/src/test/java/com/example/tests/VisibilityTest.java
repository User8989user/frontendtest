package com.example.tests;

import com.example.pages.VisibilityPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Visibility")
public class VisibilityTest extends BaseTest {

    @Test
    @Description("Проверка скрытия элемента при нажатии на кнопку Hide")
    public void testHideElement() {
        VisibilityPage page = new VisibilityPage(driver);
        assertTrue(page.isRemovedButtonDisplayed(), "Кнопка Removed должна быть видна изначально");
        page.hideRemovedButton();
        assertFalse(page.isRemovedButtonDisplayed(), "Кнопка Removed должна быть скрыта");
        takeScreenshot("visibility-hidden");
    }
}