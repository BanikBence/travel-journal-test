package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.MainPage;
import pages.StartPage;
import util.WebDriverManager;

public class SuccessfulJournalCreationSteps {
    private LoginPage loginPage;
    private MainPage mainPage;
    private StartPage startPage;

    public SuccessfulJournalCreationSteps() {
        this.loginPage = new LoginPage();
        this.mainPage = new MainPage();
        this.startPage = new StartPage();
    }

    @Given("I log in to the site as {string} and fill data as {string} and {string}")
    public void iLogInToTheSiteAsAndFillDataAsAnd(String url, String userEmail, String userPassword) {
        loginPage.navigateToSite(url);
        startPage.clickSignInButton();
        loginPage.enterUserEmail(userEmail);
        loginPage.enterPassword(userPassword);
        loginPage.clickLoginBtn();
    }

    @When("I click the CREATE NEW JOURNAL button")
    public void iClickTheButton() {
        mainPage.clickCreateNewJournalButton();

    }

    @And("I fill the Create journal form with {string}")
    public void iFillTheCreateJournalFormWith(String title) {
        mainPage.fillJournalNameInput(title);
        mainPage.clickSaveButton();
    }

    @Then("I will see the new journal with the data I put in")
    public void iWillSeeTheNewJournalWithTheDataIPutIn() {
        Assertions.assertTrue(mainPage.getCreatedJournal().contains("magical"));
        // mainPage.deleteJournal();
        WebDriverManager.quitDriver();
    }

}
