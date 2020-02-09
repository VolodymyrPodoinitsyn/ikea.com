package ikea.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = ".profile__btn.profile__btn--plain")
    private WebElement passwordButton;

    @FindBy(css = "#regular-signup-form-acceptPrivacyPolicy")
    private WebElement privacyPolicyButton;

    @FindBy(css = ".profile__btn__label")
    private List<WebElement> createProfileButton;

    @FindBy(css = "span")
    private List<WebElement> valueFields;


    public void inputFirstName(String firstName) throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(1).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        inputFields.get(2).sendKeys(lastName);
    }

    public void inputMobile(String mobile) {
        inputFields.get(3).sendKeys(mobile);
    }

    public void inputEmail(String email) {
        inputFields.get(4).sendKeys(email);
    }

    public void inputPassword(String password) {
        inputFields.get(5).sendKeys(password);
    }

    public void clickPasswordButton() throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
        passwordButton.click();
    }

    public void clickPrivacyPolicyButton() throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(privacyPolicyButton));
        privacyPolicyButton.click();
    }

    public void clickCreateProfileButton() throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(createProfileButton.get(1)));
        createProfileButton.get(1).click();
    }

    public String valueFieldsMobile() {
        wait.until(ExpectedConditions.visibilityOf(valueFields.get(69)));
        return valueFields.get(69).getText();
    }

    public String valueFieldsPassword() {
        return valueFields.get(72).getText();
    }




}
