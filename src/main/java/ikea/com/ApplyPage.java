package ikea.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-eqIVtm.bxRuVI")
    private List<WebElement> signupButton;

    public SignupPage clickSignupButton() throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(signupButton.get(1)));
        signupButton.get(1).click();
        return new SignupPage(driver);
    }
//    @FindBy(css = ".btn.btn--filled.sc-EHOje.YINzU")
//    private WebElement loginButton;
//
//    public SignupPage clickLoginButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//        loginButton.click();
//        return new SignupPage(driver);
//    }


}
