package org.petya8bachey;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkNavigationTest extends BaseTest {
    @Test
    public void testMenuLinkNavigation() {
        // Логин
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Переход по ссылке меню
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("about_sidebar_link")).click();

        // Проверка что перешли на другую страницу
        assertTrue(driver.getCurrentUrl().contains("saucelabs.com"), "Navigation to about page failed");
    }
}