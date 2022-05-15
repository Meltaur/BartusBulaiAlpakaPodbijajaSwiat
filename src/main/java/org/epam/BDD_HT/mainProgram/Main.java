package org.epam.BDD_HT.mainProgram;

import org.epam.BDD_HT.pageobject.pages.plemiona.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {

    private static final String AMAZON_URL = "https://www.plemiona.pl/";

    public static WebDriver profileSetUp() {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void testsSetUp(WebDriver driver) {
        driver.get(AMAZON_URL);
    }

    public static void main(String[] args){
        WebDriver driver = profileSetUp();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.login("NaczelnySabotazysta", "Sabotazysta123");
//        driver.quit();
//        driver.close();
    }
}
