package BDD_HT.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.epam.BDD_HT.pageobject.pages.AddedItemPage;
import org.epam.BDD_HT.pageobject.pages.ProductPage;
import org.testng.Assert;

import static BDD_HT.stepDefinitions.BaseSteps.PAGES_STORAGE;

public class AddItemPageSteps {
    @Then("{string} message is shown on {string}")
    public void messageIsShownOn(String messageShown, String pageName) {
        String addedToCart = ((AddedItemPage) PAGES_STORAGE.get(pageName)).getAddedToCart();
        Assert.assertEquals(addedToCart, messageShown,
                "No Added to Cart message appeard");

    }

    @And("Count in cart is set to {string} on {string}")
    public void countInCartIsSetTo(String one, String pageName) {
        String count = ((AddedItemPage) PAGES_STORAGE.get(pageName)).getCount();
        Assert.assertEquals(count, one,
                "Count in cart was not equal to 1");
    }


    @And("User clicks on Go to Cart button on {string}")
    public void userClicksOnGoToCartButtonOn(String pageName) {
        PAGES_STORAGE.put("Cart Page",((AddedItemPage) PAGES_STORAGE.get(pageName)).openCart());
    }
}
