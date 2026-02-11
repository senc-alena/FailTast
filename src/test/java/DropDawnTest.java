import org.testng.annotations.Test;

public class DropDawnTest extends BaseTest {

    @Test
    public void check() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }
}
