package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    By createNewJournalButton = By.xpath("//*[@class = 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-bejru3']");
    By journalContainer = By.xpath("//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-ctmtb0']");
    //By saveButton = By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-bejru3']");
    By saveButton = By.xpath("//*[@id=\"root\"]//button[text()='Save']");
    By deleteJournalButton = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[3]/button[2]");
    By deleteConfirmationButton = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-lf4vil' and text()='DELETE'] ");
    By createdJournal = By.xpath("//*[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-wcnb4v' and text()='A magical journey']");
    By journalNameInput = By.xpath("//*[@id=':r3:']");

    public void fillJournalNameInput(String journalName) {
        wait.until(ExpectedConditions.elementToBeClickable(journalNameInput));
        driver.findElement(journalNameInput).sendKeys(journalName);
    }


    public void clickCreateNewJournalButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createNewJournalButton));
        driver.findElement(createNewJournalButton).click();
    }

    public void clickSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        driver.findElement(saveButton).click();
    }

    public boolean isJournalPresent() {
        return journalContainer != null;
    }

    public String getCreatedJournal() {
        System.out.println(driver.findElement(createdJournal).getText());
        return driver.findElement(createdJournal).getText();
    }

//    public void deleteJournal() {
//        wait.until(ExpectedConditions.elementToBeClickable(deleteJournalButton));
//        driver.findElement(deleteConfirmationButton).click();
//        wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmationButton));
//        driver.findElement(deleteConfirmationButton).click();
//    }
}
