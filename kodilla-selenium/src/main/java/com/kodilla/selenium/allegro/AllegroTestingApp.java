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

        try {
            ((JavascriptExecutor) driver).executeScript(
                    "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
            );

            driver.get("https://allegro.pl/");

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//button[contains(., 'Zgadzam')]")
            ));

            WebElement confirmationField = driver.findElement(
                    By.xpath("//button[contains(., 'Zgadzam')]")
            );
            confirmationField.click();

////        Alert alert = driver.switchTo().alert();
////        alert.accept();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='meqh_en mp7g_oh mr3m_1']")));
            WebElement selectField = driver.findElement(By.cssSelector("div[class*='meqh_en mp7g_oh mr3m_1']"));
            selectField.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value*='/kategoria/elektronika']")));
            WebElement elektronikaField = driver.findElement(By.cssSelector("option[value*='/kategoria/elektronika']"));
            elektronikaField.click();

            WebElement writeField = driver.findElement(By.cssSelector("input[placeholder*='czego szukasz?']"));
            writeField.sendKeys("Mavic mini");
            writeField.submit();
        } finally {
            driver.quit();
        }
    }
}