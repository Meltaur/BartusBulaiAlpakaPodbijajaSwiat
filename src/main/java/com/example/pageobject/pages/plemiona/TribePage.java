package com.example.pageobject.pages.plemiona;

import com.example.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.example.properties.generator.timeGenerator.sleep;

public class TribePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Plemię')]")
    private WebElement tribeButton;

    @FindBy(xpath = "//*[contains(text(),'Członkowie')]")
    private WebElement membersButton;


    public TribePage(WebDriver webDriver) {
        super(webDriver);
    }


    public MembersPage openMembersTab() throws InterruptedException {
        sleep();
        new Actions(webDriver).moveToElement(tribeButton).perform();
        sleep();
        waitForVisibility(membersButton);
        membersButton.click();
        return new MembersPage(webDriver);
    }
}
