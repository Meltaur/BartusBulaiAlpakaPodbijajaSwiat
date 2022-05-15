package org.epam.BDD_HT.pageobject.pages.plemiona;

import org.epam.BDD_HT.pageobject.BasePage;
import org.epam.BDD_HT.pageobject.pages.CategoryPage;
import org.epam.BDD_HT.pageobject.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(id = "user")
    private WebElement userInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//a[contains(@class, \"btn-login\")]")
    private WebElement loginButton;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage open(){
        webDriver.get("https://www.plemiona.pl/");
        return this;
    }

    public void login(String username, String password){
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
