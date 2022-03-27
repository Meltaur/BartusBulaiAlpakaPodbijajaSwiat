package BDD_HT.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.epam.BDD_HT.pageobject.pages.AddedItemPage;
import org.epam.BDD_HT.pageobject.pages.CartPage;
import org.testng.Assert;

import static BDD_HT.stepDefinitions.BaseSteps.PAGES_STORAGE;

public class CartPageSteps {

    @And("User clicks on delete button on {string}")
    public void userClicksOnDeleteButtonOn(String pageName) {
        ((CartPage) PAGES_STORAGE.get(pageName)).deleteProduct();
    }

    @Then("{string} message appears on {string}")
    public void messageAppearsOn(String message, String pageName) {
        String emptyCartText = ((CartPage) PAGES_STORAGE.get(pageName)).getEmptyCartText();
        Assert.assertEquals(emptyCartText, message,
                "Cart isn't empty");
    }

    @And("Price of items in cart is equal to {string} on {string}")
    public void priceOfItemsInCartIsEqualToOn(String zero, String pageName) {
        String price = ((CartPage) PAGES_STORAGE.get(pageName)).getPrice();
        Assert.assertEquals(price, zero,
                "Price isn't $0.00");
    }
}
