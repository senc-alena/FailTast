package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage {
    private By frameText = By.xpath("//*[@id='tinymce']/child::p");

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public void frameSwitch() {
        driver.switchTo().frame("mce_0_ifr");
    }

    public String getFrameText() {
        return driver.findElement(frameText).getText();
    }
}
