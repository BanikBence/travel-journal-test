package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BasePage;
import pages.LoginPage;
import pages.MainPage;
import pages.StartPage;
import util.WebDriverManager;

public class LIstOwnJournalSteps {

    private LoginPage loginPage;
    private MainPage mainPage;
    private StartPage startPage;

    public LIstOwnJournalSteps() {
        this.loginPage = new LoginPage();
        this.mainPage = new MainPage();
        this.startPage = new StartPage();
    }

    @Given("I log in to the site as {string}")
    public void iLogInToTheSiteAs(String url) {
            loginPage.navigateToSite(url);

    }

    @And("I fill the required data as {string} and {string}")
    public void iFillTheRequiredDataAsAnd(String userEmail, String userPassword) {
        startPage.clickSignInButton();
        loginPage.enterUserEmail(userEmail);
        loginPage.enterPassword(userPassword);
        loginPage.clickLoginBtn();
    }

    @Then("I should see the journal as {string}")
    public void iShouldSeeTheJournalAs(String journals) {
        Assertions.assertTrue(mainPage.isJournalPresent());
       // WebDriverManager.quitDriver();
    }

}

