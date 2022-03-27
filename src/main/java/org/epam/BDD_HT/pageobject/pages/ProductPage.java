package org.epam.BDD_HT.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.epam.BDD_HT.pageobject.BasePage;

public class ProductPage extends BasePage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCardButton;

    public ProductPage(WebDriver webDriver){super(webDriver);}

    public AddedItemPage addItem(){
        addToCardButton.click();
        return new AddedItemPage(webDriver);
    }
}
