package pages;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class GooglePage {

    Sync sync = new Sync();
    WebDriver driver;
    public GooglePage(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    WebElement inpSearch;

    @FindBy(id = "result-stats")
    WebElement lbResult;

    @FindBy(xpath = "(//*[@id='search']//a)[1]")
    WebElement linkFirstRow;

    @FindBy(css = "img.lnXdpd")
    WebElement logoGoogleSearch;

    @FindBy(xpath = "xxxxxxx")
    WebElement xxxxxxxxx;

    public void searchKeyword(String keyword) {
        sync.waitForElementToBeVisible(inpSearch);
        inpSearch.sendKeys(keyword);
        inpSearch.sendKeys(Keys.ENTER);
    }

    public boolean getResultPage() {
        sync.waitForElementToBeVisible(lbResult);
        return lbResult.isDisplayed();
    }

    public void clickOnFirstLinkOnResult() {
        linkFirstRow.click();
    }

    public boolean validateGoogleSearchHomePage() {
        sync.waitForElementToBeVisible(logoGoogleSearch);
        return logoGoogleSearch.isDisplayed();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
