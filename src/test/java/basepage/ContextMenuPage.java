package basepage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage (WebDriver driver) {
        super(driver);
    }

    private By hotLocator = By.cssSelector("#hot-spot");

    public void checkContexMenu () throws InterruptedException {
        
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotLocator)).perform();

        Thread.sleep(100000);
        
    }


}
