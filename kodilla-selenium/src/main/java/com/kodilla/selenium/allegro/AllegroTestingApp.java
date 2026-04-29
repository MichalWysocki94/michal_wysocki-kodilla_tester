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

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/header/div[1]/div/div[2]/div[1]/form/div[3]/div")));
            WebElement selectField = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/header/div[1]/div/div[2]/div[1]/form/div[3]/div"));
            selectField.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(., 'Elektronika')]")));
            WebElement elektronikaField = driver.findElement(By.xpath("//option[contains(., 'Elektronika')]"));
            elektronikaField.click();

            WebElement writeField = driver.findElement(By.xpath("//input[@type='search']"));
            writeField.sendKeys("Mavic mini");
            writeField.submit();
        } finally {
            driver.quit();
        }
    }
}