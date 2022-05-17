package org.epam.BDD_HT.pageobject.pages.plemiona;

import org.epam.BDD_HT.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.epam.BDD_HT.properties.generator.timeGenerator.sleep;

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
