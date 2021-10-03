package stepDefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import pages.GooglePage;
import pages.JPMCHome;
import utils.Constants;

import static org.junit.Assert.*;

public class GoogleSearchStepDefinitions{
    GooglePage gpage = new GooglePage();
    JPMCHome jpmcHomePage = new JPMCHome();
    @Given("Open the Google Search Main Page")
    public void open_the_google_search_main_page() {
        assertTrue(gpage.validateGoogleSearchHomePage());
    }
    @When("Enter the Search Term {string} and Search")
    public void enter_the_search_term(String searchTerm) {
        gpage.searchKeyword(searchTerm);
    }
    @Then("Validate the Search Result")
    public void validate_the_search_result() {
        assertTrue(gpage.getResultPage());
    }
    @Then("Click on the first click on the result page")
    public void click_on_the_first_click_on_the_result_page() {
        gpage.clickOnFirstLinkOnResult();
    }
    @Then("Validate the Logo of the page")
    public void validate_the_logo_of_the_page() {
        assertTrue(jpmcHomePage.validateJPMCLogo());
    }
}
