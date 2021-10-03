package utils;

import core.BaseTest;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Sync extends BaseTest {

    public void waitForElementToBeVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, 30, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    // Similarly, we can write FluentWait when we have use of avoid Exception and Custom Message or Exception

    public void FluentWait(WebElement webElement){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                //.withTimeout(30, TimeUnit.SECONDS)
                //.pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return webElement.isDisplayed();
            }
        });
    }
}
