package com.example.tests;

import com.example.pages.ClickPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Click")
public class ClickTest extends BaseTest {

    @Test
    @Description("Эмуляция клика с помощью JavaScript")
    public void testJavaScriptClick() {
        ClickPage page = new ClickPage(driver);
        page.clickWithJavaScript();
        String btnClass = page.getButtonClass();
        assertTrue(btnClass.contains("btn-success"), "Кнопка не изменила класс после клика");
        takeScreenshot("click-js-success");
    }
}