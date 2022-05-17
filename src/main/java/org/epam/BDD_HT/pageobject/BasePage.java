package org.epam.BDD_HT.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    protected void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(webDriver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
