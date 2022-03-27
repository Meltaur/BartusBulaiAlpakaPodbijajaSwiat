package org.epam.BDD_HT.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.epam.BDD_HT.pageobject.BasePage;

public class AddedItemPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),\"Added to Cart\")]")
    private WebElement addToCardButton;

    @FindBy(id = "nav-cart-count")
    private WebElement count;

    @FindBy(xpath = "//a[contains(text(),\"Go to Cart\")]")
    private WebElement cart;

    public AddedItemPage(WebDriver webDriver){super(webDriver);}

    public String getAddedToCart(){
        return addToCardButton.getText();
    }

    public String getCount(){
        return count.getText();
    }

    public CartPage openCart(){
        cart.click();
        return new CartPage(webDriver);
    }

}
