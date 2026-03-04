import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {
    @Test
    public void checkFrame() {
        framePage.openPage("iframe");
        framePage.frameSwitch();
        assertEquals(framePage.getFrameText(), "Your content goes here.");
    }
}
