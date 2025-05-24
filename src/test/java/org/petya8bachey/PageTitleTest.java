package org.petya8bachey;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageTitleTest extends BaseTest {
    @Test
    public void testPageTitle() {
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle, "Page title is not as expected");
    }
}