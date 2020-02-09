package ikea.com;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected InternationaleHomePage internationaleHomePage;
    protected  HomePage homePage;
    protected  ApplyPage applyPage;
    protected SignupPage signupPage;

//     @Test
//     public void testBase(){


    @BeforeClass
    public static void start() {

        System.setProperty("webdriver.chrome.driver", "/Users/vladimirpodoinitsyn/Desktop/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.ikea.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "IKEA.com – International homepage – IKEA";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

//    @AfterClass
//    public static void finish() {
//
//          driver.quit();
//    }
}

