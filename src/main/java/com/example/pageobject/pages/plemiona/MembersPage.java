package com.example.pageobject.pages.plemiona;

import com.example.pageobject.BasePage;
import org.epam.BDD_HT.properties.Member;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static com.example.properties.generator.timeGenerator.sleep;

public class MembersPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Wojska')]")
    private WebElement armyTabButton;

    @FindBy(className = "input-nicer")
    private WebElement membersList;

    @FindBy(xpath = "//table[contains(@class, 'vis w100')]")
    private WebElement armyTable;


    public MembersPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToArmyTab() throws InterruptedException {
        sleep();
        armyTabButton.click();
    }

    public ArrayList<Member> getData(){
        ArrayList<Member> tribeMembers = new ArrayList();
        ArrayList<WebElement> allOptions = (ArrayList<WebElement>) membersList.findElements(By.xpath(".//option"));
        for (int i = 1; i<allOptions.size(); i++) {
            try {
                ArrayList<Integer> armyArray = new ArrayList();
                membersList.click();
                sleep();
                allOptions = (ArrayList<WebElement>) membersList.findElements(By.xpath(".//option"));
                String memberName = allOptions.get(i).getText();
                allOptions.get(i).click();
                waitForVisibility(armyTable);
                ArrayList<WebElement> rowVals = (ArrayList<WebElement>) armyTable.findElements(By.tagName("td"));
                for(int j=1; j<rowVals.size(); j++){
                    armyArray.add(parseInt(rowVals.get(j).getText()));
                }
                sleep();
                int[] arr = armyArray.stream().mapToInt(a -> a).toArray();
                Member member = new Member(memberName, arr);
                tribeMembers.add(member);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return tribeMembers;
    }

}
