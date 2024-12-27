package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //navigate to url
        driver.get("https://ecommerce.tealiumdemo.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
