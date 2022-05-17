package org.epam.BDD_HT.mainProgram;

import org.epam.BDD_HT.pageobject.pages.plemiona.MainPage;
import org.epam.BDD_HT.pageobject.pages.plemiona.MembersPage;
import org.epam.BDD_HT.pageobject.pages.plemiona.TribePage;
import org.epam.BDD_HT.properties.Member;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {
    private static ArrayList<Member> data;

    public static WebDriver profileSetUp() {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = profileSetUp();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        TribePage tribePage = mainPage.login("NaczelnySabotazysta", "Sabotazysta123");
        MembersPage membersPage = tribePage.openMembersTab();
        membersPage.goToArmyTab();
        data = membersPage.getData();
        for(Member member : data){
            System.out.println(member.getName());
            System.out.println(Arrays.toString(member.getArmyArray()));
        }
        driver.quit();
        driver.close();
    }
}
