package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonUtils;
import utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;

public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    @Before
    public void testInit(){
        browserSetup();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    private void browserSetup(){
        WebDriverManager.chromedriver().setup();
        Properties testProps = CommonUtils.readPropertiesFile(Constants.TEST_PROPS);
         driver = new ChromeDriver();
        driver.get(testProps.getProperty("basePage"));
        driver.manage().window().maximize();
    }

}
