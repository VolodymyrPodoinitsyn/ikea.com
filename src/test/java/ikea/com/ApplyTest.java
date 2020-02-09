package ikea.com;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class ApplyTest extends BaseTest {

    private static Logger log = Logger.getLogger(ApplyTest.class.getName());

    @Test
    public void testApply() throws InterruptedException {
        log.info("Starting test Apply");
        internationaleHomePage =new InternationaleHomePage(driver);
        log.info("Internationale page is opened");
        homePage = internationaleHomePage.clickGoTooWebsiteButton();
        log.info("User clicked on the goToWebsite button and home page is opened");
        applyPage = homePage.clickMyProfileButton();
        log.info("User clicked on the myProfile button and apply page is opened");
        signupPage = applyPage.clickSignupButton();
        log.info("User clicked on the singIn button and singUp page is opened");
        signupPage.inputFirstName("Vlad");
        log.info("User input first name \"Vlad\"");
        signupPage.inputLastName("Pupkin");
        log.info("User input last name \"Pupkin\"");
        signupPage.inputMobile("322223322");
        log.info("User input mobile number \"322223322\"");
        signupPage.inputEmail("vlad@gmail.com");
        log.info("User input email \"vlad@gmail.com\"");
        signupPage.inputPassword("3151020");
        log.info("User input password \"3151020\"");
        signupPage.clickPasswordButton();
        log.info("User clicked password button and saw password");
        signupPage.clickPrivacyPolicyButton();
        log.info("User clicked privacy policy button");
        signupPage.clickCreateProfileButton();
        log.info("User clicked create profile button");
        Assert.assertEquals("Your mobile number is not valid.", signupPage.valueFieldsMobile());
        log.info("Took the error value mobile field and compared with the expected error value mobile field");
        Assert.assertEquals("Your password must contain:", signupPage.valueFieldsPassword());
        log.info("Took the error value password field and compared with the expected error value password field");


    }
}
