package ikea.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InternationaleHomePage extends BasePage {
    public InternationaleHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn.btn--filled.trailing-icon.btn--block.main-content__cta")
    private WebElement goTooWebsiteButton;

    public HomePage clickGoTooWebsiteButton() {
        wait.until(ExpectedConditions.elementToBeClickable(goTooWebsiteButton));
        goTooWebsiteButton.click();
        return new HomePage(driver);
    }
}
