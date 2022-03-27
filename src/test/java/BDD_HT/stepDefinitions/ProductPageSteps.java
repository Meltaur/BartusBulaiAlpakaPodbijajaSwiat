package BDD_HT.stepDefinitions;

import io.cucumber.java.en.And;
import org.epam.BDD_HT.pageobject.pages.CategoryPage;
import org.epam.BDD_HT.pageobject.pages.ProductPage;

import static BDD_HT.stepDefinitions.BaseSteps.PAGES_STORAGE;

public class ProductPageSteps {

    @And("User clicks on add to cart button on {string}")
    public void userClicksOnAddToCartButtonOn(String pageName) {
        PAGES_STORAGE.put("Add Item Page",((ProductPage) PAGES_STORAGE.get(pageName)).addItem());
    }
}
