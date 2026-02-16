import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test
    public void testContextMenuAlert() {
        contextMenuPage.openPage("context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));  // ← здесь ошибка
        new Actions(driver).contextClick(box).perform();

        Alert alert = driver.switchTo().alert();
        assertEquals("You selected a context menu", alert.getText());

        alert.accept();
        driver.quit();
    }
}
