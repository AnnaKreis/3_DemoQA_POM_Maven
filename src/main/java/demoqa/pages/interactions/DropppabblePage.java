package demoqa.pages.interactions;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DropppabblePage extends BasePage {
    public DropppabblePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DropppabblePage actionDragMe() {
        pause(1000);
        moveWithJS(0, 400);
        new Actions(driver).dragAndDrop(dragMe, dropHere).perform();
        return this;
    }

    public DropppabblePage verifyDropped(String text) {
        Assert.assertTrue(shouldHaveText(dropHere, text, 5));
        return this;
    }
}
