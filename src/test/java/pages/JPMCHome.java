package pages;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class JPMCHome extends BaseTest {

    Sync sync = new Sync();;
    WebDriver driver;
    public JPMCHome(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".logo-desktop-only .first-logo")
    WebElement companyLogo;

    @FindBy(xpath = "xxxxxxx")
    WebElement xxxxxxxxx;

    public boolean validateJPMCLogo() {
        sync.waitForElementToBeVisible(companyLogo);
        return companyLogo.isDisplayed();
    }


}
