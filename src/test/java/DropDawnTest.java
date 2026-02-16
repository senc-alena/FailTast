import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDawnTest extends BaseTest {

    @Test
    public void check() throws InterruptedException {
        contextMenuPage.openPage("context_menu");
        contextMenuPage.checkContexMenu();
        assertEquals(contextMenuPage.checkAlertMessage(),
                "You selected a context menu");
        contextMenuPage.closeAlert();
        Thread.sleep(5000);
    }
}
