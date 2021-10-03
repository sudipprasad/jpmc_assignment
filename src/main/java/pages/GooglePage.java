package pages;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class GooglePage extends BaseTest {

    Sync sync;

    public GooglePage(){
        PageFactory.initElements(getDriver(), GooglePage.class);
        sync = new Sync();
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
        sync.waitForElementToBeVisible(lbResult);
    }

    public boolean getResultPage() {
        return lbResult.isDisplayed();
    }

    public void clickOnFirstLinkOnResult() {
        linkFirstRow.click();
    }

    public boolean validateGoogleSearchHomePage() {
        sync.waitForElementToBeVisible(logoGoogleSearch);
        return logoGoogleSearch.isDisplayed();
    }
}
