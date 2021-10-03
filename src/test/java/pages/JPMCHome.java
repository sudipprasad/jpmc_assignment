package pages;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class JPMCHome extends BaseTest {

    Sync sync = new Sync();;

    public boolean validateJPMCLogo() {
        WebElement companyLogo = driver.findElement(By.cssSelector(".logo-desktop-only .first-logo"));
        sync.waitForElementToBeVisible(companyLogo);
        return companyLogo.isDisplayed();
    }


}
