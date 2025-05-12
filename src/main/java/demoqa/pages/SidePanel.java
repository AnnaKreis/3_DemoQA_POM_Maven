package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.alertsFrameWindows.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
