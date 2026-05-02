package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void search(String type){
        searchField.sendKeys(type);
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(results));
    }

    public int getResultsCount() {
        return results.size();
    }

    public void clearSearch() {
        searchField.clear();
    }

}
