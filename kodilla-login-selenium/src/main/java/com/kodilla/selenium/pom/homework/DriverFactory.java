package com.kodilla.selenium.pom.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.setExperimentalOption(
                "excludeSwitches",
                new String[]{"enable-automation"}
        );
        chromeOptions.setExperimentalOption(
                "useAutomationExtension",
                false
        );

        return new ChromeDriver(chromeOptions);
    }
}