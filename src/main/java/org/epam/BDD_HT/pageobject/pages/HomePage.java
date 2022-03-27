package org.epam.BDD_HT.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.epam.BDD_HT.pageobject.BasePage;

public class HomePage extends BasePage {

    @FindBy(className = "landscape-image")
    private WebElement firstCategory;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open(){
        webDriver.get("https://www.amazon.com");
        return this;
    }

    public CategoryPage openCategory(){
        firstCategory.click();
        return new CategoryPage(webDriver);
    }
}
