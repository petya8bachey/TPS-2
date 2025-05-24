package org.petya8bachey;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VisibilityTest extends BaseTest {
    @Test
    public void testElementsVisibility() {
        assertTrue(driver.findElement(By.id("user-name")).isDisplayed(), "Username field is not displayed");
        assertTrue(driver.findElement(By.id("password")).isDisplayed(), "Password field is not displayed");
        assertTrue(driver.findElement(By.id("login-button")).isDisplayed(), "Login button is not displayed");
    }
}