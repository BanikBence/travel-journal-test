package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{
    By journalContainer = By.xpath("//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-ctmtb0']");

    public boolean isJournalPresent() {
        return journalContainer != null;
    }
}
