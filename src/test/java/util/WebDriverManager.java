package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;

    public WebDriverManager() {
    }

    public static WebDriver getInstance() {
        ChromeOptions options = new ChromeOptions();
        return driver == null ? driver = new ChromeDriver(options) : driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}
