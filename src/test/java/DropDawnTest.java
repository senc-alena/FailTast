import org.testng.annotations.Test;

import static basepage.BasePage.BASE_URL;

public class DropDawnTest extends BaseTest {

    @Test
    public void check() throws InterruptedException {
        contextMenuPage.openPage("context_menu");
        contextMenuPage.checkContexMenu();
    }
}
