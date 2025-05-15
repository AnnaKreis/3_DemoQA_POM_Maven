package demoqa.tests.widgets;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.widgets.SelectMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getWidgets();
        new SidePanel(app.driver, app.wait).getSelectMenu()
                .hideAds();
        //iFrames
    }

    @Test
    public void selectOldStyleTest() {
        new SelectMenuPage(app.driver, app.wait)
                .selectOldStyle("Blue")
                .verifyColor();
    }

    @Test
    public void multiSelectTest() {
        new SelectMenuPage(app.driver, app.wait)
                .multiSelect(new String[]{"Blue", "Red"});
    }

    @Test
    public void StandartMultiSelectTest() {
        new SelectMenuPage(app.driver, app.wait)
                .standartMultiSelect(new String[]{"Volvo", "Audi"});
    }
}
