package org.petya8bachey;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonClickTest extends BaseTest {
    @Test
    public void testLoginButton() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed after button click");
    }

    @Test
    public void testAddToCartButton() {
        // Логин
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Нажатие кнопки добавления в корзину
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Проверка что кнопка изменилась на "Remove"
        assertTrue(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed(),
                "Add to cart button did not work");
    }
}