package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class KodillaStorePom extends AbstractStorePom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;

    @FindBy(css = ".element-img") // przykładowy selektor produktu
    List<WebElement> results;

    public KodillaStorePom(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int search(String text) {
        searchField.clear();
        searchField.sendKeys(text);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(driver ->
                searchField.getAttribute("value").equals(text)
        );

        return driver.findElements(By.cssSelector(".element")).size();
    }

//    public void search(String type){
//        searchField.sendKeys(type);
//        searchField.sendKeys(Keys.ENTER);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfAllElements(results));
//    }

    public int getResultsCount() {
        return results.size();
    }

    public void clearSearch() {
        searchField.clear();
    }

}
