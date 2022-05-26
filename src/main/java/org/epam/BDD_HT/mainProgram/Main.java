package org.epam.BDD_HT.mainProgram;

import org.json.simple.*;
import org.epam.BDD_HT.pageobject.pages.plemiona.MainPage;
import org.epam.BDD_HT.pageobject.pages.plemiona.MembersPage;
import org.epam.BDD_HT.pageobject.pages.plemiona.TribePage;
import org.epam.BDD_HT.properties.Member;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class Main {
    public static JSONObject JsonVillage(int[] jednostki, String nazwaGracza)
    {
        JSONObject wioska = new JSONObject();
        wioska.put("nazwa",  nazwaGracza);
        wioska.put("pik",   jednostki[0]);
        wioska.put("miecz", jednostki[1]);
        wioska.put("top",   jednostki[2]);
        wioska.put("luk",   jednostki[3]);
        wioska.put("zwiad", jednostki[4]);
        wioska.put("lk",    jednostki[5]);
        wioska.put("lkk",   jednostki[6]);
        wioska.put("ck",    jednostki[7]);
        wioska.put("taran", jednostki[8]);
        wioska.put("kat",   jednostki[9]);
        wioska.put("ryc",   jednostki[10]);
        wioska.put("szlach",jednostki[11]);
        wioska.put("chlop", jednostki[12]);
        wioska.put("kom",   jednostki[13]);
        wioska.put("ataki", jednostki[14]);

        return wioska;
    }
    private static ArrayList<Member> data;

    public static WebDriver profileSetUp() {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] jednostki = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        JSONObject wioska;
        JSONArray array = new JSONArray();
        WebDriver driver = profileSetUp();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        TribePage tribePage = mainPage.login("NaczelnySabotazysta", "Sabotazysta123");
        MembersPage membersPage = tribePage.openMembersTab();
        membersPage.goToArmyTab();
        data = membersPage.getData();
        for(Member member : data) {
            System.out.println(member.getName());
            System.out.println(Arrays.toString(member.getArmyArray()));

            wioska = JsonVillage(member.getArmyArray(), member.getName());
            array.add(wioska);
        }
        try {
            FileWriter file = new FileWriter("JsonFile.json");
            file.write(array.toJSONString());
            file.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
        driver.quit();
        driver.close();
    }
}
