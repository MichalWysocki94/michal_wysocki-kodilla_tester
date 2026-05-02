package com.kodilla.selenium.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaPomApplication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
            chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com", "haslo");
        driver.close();




//        KodillaLoginPom loginPom = new KodillaLoginPom();
//        loginPom.login("test@kodilla.com", "haslo");
//        loginPom.close();
    }
}
