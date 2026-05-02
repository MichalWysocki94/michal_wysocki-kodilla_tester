package com.kodilla.selenium.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

//    WebDriver driver;

    public KodillaLoginPom(WebDriver driver){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
//        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        chromeOptions.setExperimentalOption("useAutomationExtension", false);
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver = new ChromeDriver(chromeOptions);
        super(driver);
        PageFactory.initElements(driver, this);
//        driver.navigate().to("https://kodilla.com/pl/test/login");

    }

    public boolean login(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String message = alert.getText();
        alert.dismiss();
        return message.equals("Jesteś teraz zalogowany!");
    }

//    public void close(){
//        driver.close();
//    }

}