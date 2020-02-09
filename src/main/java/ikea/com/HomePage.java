package ikea.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".hnf-btn.hnf-btn--icon")
    private List<WebElement> myProfileButton;

    public ApplyPage clickMyProfileButton() {
        wait.until(ExpectedConditions.elementToBeClickable(myProfileButton.get(2)));
        myProfileButton.get(2).click();
        return new ApplyPage(driver);
    }

}
