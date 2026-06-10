package com.example.tests;

import com.example.pages.FramesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("Frames")
public class FramesTest extends BaseTest {

    @Test
    @Description("Переключение во вложенный фрейм и клик по кнопке")
    public void testNestedFrame() {
        FramesPage framesPage = new FramesPage(driver);
        String originalText = framesPage.getButtonTextInsideFrame();
        framesPage.clickButtonInsideNestedFrame();
        // После клика текст кнопки может измениться – проверяем ожидаемое значение
        String newText = framesPage.getButtonTextInsideFrame();
        assertEquals("Clicked", newText, "Кнопка не изменила текст после клика");
        takeScreenshot("frames-clicked");
    }
}