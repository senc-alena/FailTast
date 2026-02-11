package basepage;

import org.openqa.selenium.WebDriver;

public class HerokuPage extends BasePage {

    public HerokuPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL);
    }
}
