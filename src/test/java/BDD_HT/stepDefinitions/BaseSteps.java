package BDD_HT.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.epam.BDD_HT.enumeration.factory.WebDriverFactory;
import org.epam.BDD_HT.pageobject.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static WebDriver webDriver;
    public static final Map<String, BasePage> PAGES_STORAGE = new HashMap<>();

    @Before
    public void initWbDriver(){
        webDriver = new WebDriverFactory().getWebDriver();
    }

    @After
    public void afterScenario(){
        webDriver.close();
        webDriver.quit();
    }
}