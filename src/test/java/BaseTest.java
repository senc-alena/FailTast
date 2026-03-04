import basepage.ContextMenuPage;
import basepage.FramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    FramePage framePage;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        contextMenuPage = new ContextMenuPage(driver);
        framePage = new FramePage(driver);
    }

    @AfterMethod
    public void tearDown() {
/*         driver.quit(); */
    }
}
