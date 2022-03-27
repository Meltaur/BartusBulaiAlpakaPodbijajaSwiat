package org.epam.BDD_HT.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.epam.BDD_HT.pageobject.BasePage;

public class CategoryPage extends BasePage {

    @FindBy(className = "s-image")
    private WebElement firstElement;

    public CategoryPage(WebDriver webDriver){super(webDriver);}

    public ProductPage openProduct(){
        firstElement.click();
        return new ProductPage(webDriver);
    }
}
