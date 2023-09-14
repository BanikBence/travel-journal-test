package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.WebDriverManager;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriverWait wait;
    WebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.getInstance();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public void waitAndClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void quitDriver() {
        WebDriverManager.quitDriver();
    }

    public void driverRefresh() {
        driver.navigate().refresh();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
}
