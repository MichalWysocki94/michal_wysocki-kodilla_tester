package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    private WebDriver driver;
    private KodillaStorePom store;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        chromeOptions.setExperimentalOption("useAutomationExtension", false);


        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        store = new KodillaStorePom(driver);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void testSearchResultsCount() {
        store.search("NoteBook");
        assertEquals(2, store.getResultsCount());

        store.clearSearch();
        store.search("School");
        assertEquals(1, store.getResultsCount());

        store.clearSearch();
        store.search("Brand");
        assertEquals(1, store.getResultsCount());

        store.clearSearch();
        store.search("Business");
        assertEquals(0, store.getResultsCount());

        store.clearSearch();
        store.search("Gaming");
        assertEquals(1, store.getResultsCount());

        store.clearSearch();
        store.search("Powerful");
        assertEquals(0, store.getResultsCount());
    }


    @Test
    void testCaseInsensitiveSearch() {
        store.search("notebook");
        int lowerCase = store.getResultsCount();

        store.clearSearch();
        store.search("NOTEBOOK");
        int upperCase = store.getResultsCount();

        assertEquals(lowerCase, upperCase);
    }
}