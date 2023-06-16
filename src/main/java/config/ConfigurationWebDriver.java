package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ConfigurationWebDriver {
    static WebDriver driver = null;
    public static WebDriver createDriver(Webdrivers webdrivers) {
        switch (webdrivers) {
            case CHROME:
                createChrome();
            case CHROME_INCOGNITO:
                createChromeIncognito();
        }
        return driver;
    }
    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver =new ChromeDriver(options);
    }
}





