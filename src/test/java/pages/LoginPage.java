package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    By emailInput = By.xpath("//*[@id='email']");
    By passwordInput = By.xpath("//*[@id='password']");
    By loginButton = By.xpath("//*[@type='submit']");

    public void navigateToSite(String url) {
        driver.get(url);
    }

    public void enterUserEmail(String userEmail) {
        wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        driver.findElement(emailInput).sendKeys(userEmail);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }

//    public void login(String username, String password) {
//        enterUserEmail(username);
//        enterPassword(password);
//    }

}

