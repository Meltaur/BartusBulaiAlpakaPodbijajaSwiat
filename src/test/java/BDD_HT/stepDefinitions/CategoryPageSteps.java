package BDD_HT.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.epam.BDD_HT.pageobject.pages.CategoryPage;

import static BDD_HT.stepDefinitions.BaseSteps.PAGES_STORAGE;

public class CategoryPageSteps {
    @And("User clicks on first headphone on {string}")
    public void userClicksOnFirstHeadphoneOn(String pageName) {
        PAGES_STORAGE.put("Product Page",((CategoryPage) PAGES_STORAGE.get(pageName)).openProduct());
    }

}
