package demoqa.pages.alertsFrameWindows;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage alertWithTime() {
        click(timerAlertButton);
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(id = "alertButton")
    WebElement alertButton;

    public AlertsPage handleSimpleAlert() {
        click(alertButton);
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent()).accept();
        return this;

    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsPage selectResult(String result) {
        click(confirmButton, 0, 500);
        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        };
        return this;
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        click(promtButton,0, 300);
        if(message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }

//    @FindBy
//    public AlertsPage verifyEmptyText() {
//        if()
//        return this;
//    }
}
