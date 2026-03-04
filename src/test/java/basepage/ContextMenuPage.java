package basepage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class  ContextMenuPage extends BasePage {
    private Alert alert;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private By hotLocator = By.cssSelector("#hot-spot");

    public void checkContexMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotLocator)).perform();
    }

    public String checkAlertMessage() {
        alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void closeAlert() {
        alert.accept();
    }
}
