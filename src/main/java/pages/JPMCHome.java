package pages;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class JPMCHome extends BaseTest {

    Sync sync;

    public JPMCHome(){
        PageFactory.initElements(getDriver(), JPMCHome.class);
        sync = new Sync();
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
