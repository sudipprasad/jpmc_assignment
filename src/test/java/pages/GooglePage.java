package pages;

import core.BaseTest;
import org.apache.commons.io.input.TaggedReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.Sync;

public class GooglePage extends BaseTest {

    Sync sync = new Sync();

    public void searchKeyword(String keyword) {
        WebElement inpSearch = driver.findElement(By.name("q"));
        sync.waitForElementToBeVisible(inpSearch);
        inpSearch.sendKeys(keyword);
        inpSearch.sendKeys(Keys.ENTER);
    }

    public boolean getResultPage() {
        WebElement lbResult = driver.findElement(By.id("result-stats"));
        sync.waitForElementToBeVisible(lbResult);
        return lbResult.isDisplayed();
    }

    public void clickOnFirstLinkOnResult() {
        WebElement linkFirstRow = driver.findElement(By.xpath("(//*[@id='search']//a)[1]"));
        linkFirstRow.click();
    }

    public boolean validateGoogleSearchHomePage() {
        WebElement logoGoogleSearch = driver.findElement(By.cssSelector("img.lnXdpd"));
        sync.waitForElementToBeVisible(logoGoogleSearch);
        return logoGoogleSearch.isDisplayed();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
