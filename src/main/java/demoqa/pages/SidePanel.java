package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.alertsFrameWindows.AlertsPage;
import demoqa.pages.alertsFrameWindows.BrowserWindowsPage;
import demoqa.pages.interactions.DropppabblePage;
import demoqa.pages.widgets.MenuPage;
import demoqa.pages.widgets.SelectMenuPage;
import demoqa.pages.widgets.SlidersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.BaseRowSet;

public class SidePanel extends BasePage {

    public SidePanel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage selectLogin() {
        click(login, 0, 500);
        return new LoginPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        click(alerts, 0, 300);
        return new AlertsPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public SidePanel selectIFrame() {
        click(frames, 0, 300);
        return new SidePanel(driver, wait);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        click(nestedFrames, 0, 300);
        return new FramePage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindow;

    public BrowserWindowsPage selectBrowserWindow() {
        click(browserWindow, 0, 300);
        return new BrowserWindowsPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage getSelectMenu() {
        click(selectMenu, 0, 600);
        return new SelectMenuPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage getMenu() {
        click(menu, 0, 600);
        return new MenuPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;

    public SlidersPage selectSlider() {
        click(slider, 0, 400);
        return new SlidersPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DropppabblePage selectDroppable() {
        click(droppable, 0, 400);
        return new DropppabblePage(driver, wait);
    }
}
