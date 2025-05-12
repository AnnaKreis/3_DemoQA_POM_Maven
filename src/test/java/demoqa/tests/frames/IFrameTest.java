package demoqa.tests.frames;

import demoqa.core.TestBase;
import demoqa.pages.FramePage;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getAlertsFrameWindows();
    }

    @Test
    public void iFrameTest() {
        new SidePanel(app.driver, app.wait).selectIFrame();
        new FramePage(app.driver, app.wait).returnListOfFrames()
        .switchToFrameIndex(2)
        .verifyIFrameText("This is a sample page");
    }

}
