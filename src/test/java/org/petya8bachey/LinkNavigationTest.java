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

        // Нажатие кнопки добавления в корзину
        driver.findElement(By.id("shopping_cart_link")).click();

        assertTrue(driver.getCurrentUrl().contains("cart.html"),
                "Navigation to shopping cart page failed");

    }
}