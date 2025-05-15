package demoqa.pages.widgets;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;

public class SlidersPage extends BasePage {

    public SlidersPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = ".range-slider")
    WebElement sliderInput;

    public SlidersPage moveSliderInHorizontalDirection() {
        pause(1000);
        moveWithJS(0, 200);
        new Actions(driver).dragAndDropBy(sliderInput, 260, 0).perform();
        return this;
    }

    public SlidersPage verifySliderValue(String number) {
        Assert.assertEquals(sliderInput.getDomAttribute("value"), number);
        return this;
    }
}
