package org.petya8bachey;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextInputTest extends BaseTest {
    @Test
    public void testTextInput() {
        String testUsername = "test_user";
        String testPassword = "test_password";

        driver.findElement(By.id("user-name")).sendKeys(testUsername);
        driver.findElement(By.id("password")).sendKeys(testPassword);

        assertEquals(testUsername, driver.findElement(By.id("user-name")).getAttribute("value"),
                "Username field value is incorrect");
        assertEquals(testPassword, driver.findElement(By.id("password")).getAttribute("value"),
                "Password field value is incorrect");
    }
}