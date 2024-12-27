package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Add_Pro_Acc_Cart;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D03_Add_Pro_Acc_Cart {
    P03_Add_Pro_Acc_Cart addProAccCart=new P03_Add_Pro_Acc_Cart();
    @Given("user navigate to accessories")
    public void usernavigatetoaccessories()
    {
        addProAccCart.accessories().click();
    }

    @And("user select shoes fro subcategory")
    public void userSelectShoesFroSubcategory()
    {
        addProAccCart.shoes().click();
    }

    @And("user filter shoes by price")
    public void userFilterShoesByPrice()
    {
        addProAccCart.lists_Filter_by_price().get(0).click();
        Actions actions = new Actions(Hooks.driver); //this can to scroll down
        actions.scrollByAmount(0, 500).pause(300).perform();
    }

    @And("user view the details fo the product")
    public void userViewTheDetailsFoTheProduct()
    {
        Actions actions = new Actions(Hooks.driver); //this can to scroll down
        actions.scrollByAmount(0, 500).pause(300).perform();
        addProAccCart.viewDetails().click();
    }

    @And("user select the color and size")
    public void userSelectTheColorAndSize()
    {
        Actions actions = new Actions(Hooks.driver); //this can to scroll down
        actions.scrollByAmount(0, 500).pause(300).perform();
        addProAccCart.color().click();
    }

    @When("the user add this product to cart")
    public void theUserAddThisProductToCart()
    {
        addProAccCart.size().click();
        //addProAccCart.theCart().click();
    }

    @Then("the product added successfully")
    public void theProductAddedSuccessfully() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000000));
        wait.until(ExpectedConditions.visibilityOf(addProAccCart.popMessageAddedProd()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(addProAccCart.popMessageAddedProd().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(addProAccCart.popMessageAddedProd().getText().contains("Hana Flat, Charcoal was added to your shopping cart."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(addProAccCart.popMessageAddedProd().getText());
    }
}
