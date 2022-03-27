package BDD_HT.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.epam.BDD_HT.pageobject.pages.HomePage;;import static BDD_HT.stepDefinitions.BaseSteps.PAGES_STORAGE;
import static BDD_HT.stepDefinitions.BaseSteps.webDriver;

public class HomePageSteps {
    @Given("User is on {string}")
    public void userIsOnHomePage(String pageName){
        HomePage homePage = new HomePage(webDriver);
        PAGES_STORAGE.put(pageName, homePage);
        homePage.open();
    }

    @And("User clicks on Headsets category page on {string}")
    public void userClicksOnHeadsetsCategoryPageOn(String pageName) {
        PAGES_STORAGE.put("Category Page", ((HomePage) PAGES_STORAGE.get(pageName)).openCategory());
    }


}
