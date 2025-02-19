package com.chromatech.automation.utils;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() throws IllegalArgumentException {

        switch (TestProperties.BROWSER.toLowerCase()) {
            case "chrome":
                if(TestProperties.HEADLESS.equalsIgnoreCase("true")){
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);
                }else {
                    driver = new ChromeDriver();
                }
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("* * INVALID BROWSER * * PLEASE ENTER VALID BROWSER NAME * *");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
