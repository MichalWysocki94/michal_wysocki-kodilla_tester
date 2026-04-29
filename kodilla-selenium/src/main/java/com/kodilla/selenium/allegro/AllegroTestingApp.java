package com.kodilla.selenium.allegro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        chromeOptions.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(chromeOptions);

        ((JavascriptExecutor) driver).executeScript(
                "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
        );

        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button")));

        WebElement confirmationField = driver.findElement(By.xpath("//button"));
        confirmationField.click();

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@data-role,'search-scope-select')]")));
        WebElement selectField = driver.findElement(By.xpath("//*[contains(@data-role,'search-scope-select')]/select[1]"));
        Select categorySelect = new Select(selectField);
        categorySelect.selectByIndex(5);

        WebElement writeField = driver.findElement(By.xpath("//input"));
        writeField.sendKeys("Mavic mini");
        writeField.submit();

    }
}