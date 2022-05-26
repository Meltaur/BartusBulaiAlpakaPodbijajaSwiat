package com.example.pageobject.pages.plemiona;

import com.example.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.properties.generator.timeGenerator.sleep;

public class MainPage extends BasePage {

    @FindBy(id = "user")
    private WebElement userInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//a[contains(@class, \"btn-login\")]")
    private WebElement loginButton;

    @FindBy(className = "world_button_active")
    private WebElement worldButton;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage open(){
        webDriver.get("https://www.plemiona.pl/");
        return this;
    }

    public TribePage login(String username, String password) throws InterruptedException {
        userInput.sendKeys(username);
        sleep();
        passwordInput.sendKeys(password);
        sleep();
        loginButton.click();
        waitForVisibility(worldButton);
        sleep();
        worldButton.click();
        return new TribePage(webDriver);
    }


}
