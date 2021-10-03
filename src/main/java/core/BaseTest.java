package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonUtils;
import utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/",
        glue = "stepDefinitions",
        plugin = "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter")


public class BaseTest {
    public static WebDriver driver;

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
