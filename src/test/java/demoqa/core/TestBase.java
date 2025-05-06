package demoqa.core;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestBase {
    public final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();
    }
    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
