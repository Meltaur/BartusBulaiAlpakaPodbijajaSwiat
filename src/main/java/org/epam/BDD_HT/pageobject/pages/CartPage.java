package org.epam.BDD_HT.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.epam.BDD_HT.pageobject.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@value='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//h1[contains(text(),\"Your Amazon Cart is empty.\")]")
    private WebElement emptyCart;

    @FindBy(xpath = "//span[contains(text(),\"$0.00\")]")
    private WebElement zeroPrice;

    public CartPage(WebDriver webDriver){super(webDriver);}

    public String getEmptyCartText(){
        new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(emptyCart));
        return emptyCart.getText();
    }

    public String getPrice(){
        new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(zeroPrice));
        return zeroPrice.getText();
    }

    public void deleteProduct(){
        deleteButton.click();
    }

}
