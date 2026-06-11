package com.example.tests;

import com.example.pages.ClickPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClickTest extends BaseTest {
    @Test
    public void testJavaScriptClick() {
        ClickPage page = new ClickPage(driver);
        page.clickWithJavaScript();
        assertTrue(page.isButtonSuccess(), "Кнопка не получила класс btn-success после клика");
    }
}