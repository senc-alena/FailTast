package basepage;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public static final String BASE_URL = "http://the-internet.herokuapp.com/";
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(BASE_URL + url);
    }
}
