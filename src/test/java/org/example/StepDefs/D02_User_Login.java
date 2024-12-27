package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_User_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D02_User_Login {
    private static final Logger log = LoggerFactory.getLogger(D02_User_Login.class);
    //create an object from webdriver and reference value for EdgeDriver
    WebDriver driver = new EdgeDriver();
    //create an object from class of login page to use it methods
    P02_User_Login login_page = new P02_User_Login();

    //(Cucumber and TestNG) freamwork to allow wright test cases by using BBD in resource  and use it by the annotation of testng
    //this is annotation of given to this method to click on the button account and click on login
    @Given("user click on the Account button and select login")
    public void userclickontheAccountbuttonandselectlogin() throws InterruptedException {
        login_page.account_btn().click(); //click on the account btn
        login_page.lists_of_account().get(5).click(); //and click on the login page by using index of the lists
    }

    //this annotation of then to assert that login page is loaded
    @Then("redirct me to the login page")
    public void redirctMeToTheLoginPage() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.login_page())); //user this implicit wait to wait that login page is loaded even the time out
        SoftAssert softAssert = new SoftAssert(); //use this softassert to assert more than one elements;;
        softAssert.assertTrue(login_page.login_page().isDisplayed()); //here assert the login page is displayed
        softAssert.assertAll();

    }

    //this method to enter valid email
    @And("user enter valid {string}")
    public void userEnterValidEmail(String string) {
        login_page.email().sendKeys(string);
    }

    //this method to enter valid password
    @And("enter valid {string}")
    public void enterValidPassword(String string) {
        login_page.password().sendKeys(string);
    }

    //this method to click the login button
    @When("user click on login")
    public void userClickOnLogin() throws InterruptedException {
        Actions actions = new Actions(Hooks.driver); //this can to scroll down
        actions.scrollByAmount(0, 500).pause(300).perform();
        login_page.login_btn().click();
        Thread.sleep(2000);
    }

    //assert the login is done successfully by using assertion
    @Then("the login is done successfully")
    public void theLoginIsDoneSuccessfully() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.login_success()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.login_success().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.login_success().getText().contains("MY DASHBOARD"));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.login_success().getText());
    }

    //this method to enter invalid format email
    @And("user enter invalid email {string}")
    public void userEnterInvalidFormat(String string) {
        login_page.email().sendKeys(string);
    }

//    @Then("there error message is displayed")
//    public void thereErrorMessageIsDisplayed()
//    {
//        if (login_page.err_invalid_email().getText().contains("Please enter a valid email address. For example johndoe@domain.com."))
//        {
//            System.out.println("aa");
//        }
//        else if(login_page.err_empty_email().getText().contains("This is a required field."))
//        {
//            System.out.println("asd");
//        }
//        else
//        {
//            System.out.println("vvv");
//        }
//    }
//this method for assert that error message is displayed where the user enter invalid email format
    @Then("there error message is displayed for invalid email format")
    public void thereErrorMessageIsDisplayedForInvalidFormat()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.err_invalid_email()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.err_invalid_email().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.err_invalid_email().getText().contains("Please enter a valid email address. For example johndoe@domain.com."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.err_invalid_email().getText());
    }
//this method for enter empty email
    @And("user enter empty email {string}")
    public void userEnterEmptyEmail(String string)
    {
        login_page.email().sendKeys(string);
    }
//this method for assert that error message is displayed where the user enter empty email
    @Then("there error message is displayed for empty email")
    public void thereErrorMessageIsDisplayedForEmptyEmail()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.err_empty_email()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.err_empty_email().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.err_empty_email().getText().contains("This is a required field."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.err_empty_email().getText());
    }
//this method for enter not registered email
    @And("user enter not registered email {string}")
    public void userEnterNotRegisteredEmail(String string)
    {
        login_page.email().sendKeys(string);
    }
//his method for assert that error message is displayed where the user enter not registered email
    @Then("there error message is displayed for not registered email")
    public void thereErrorMessageIsDisplayedForNotRegisteredEmail()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.err_not_Regis_email()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.err_not_Regis_email().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.err_not_Regis_email().getText().contains("Invalid login or password."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.err_not_Regis_email().getText());
    }
//this method for enter invalid password for registered email
    @And("enter invalid {string} for registered email")
    public void enterInvalidForRegisteredEmail(String string)
    {
        login_page.password().sendKeys(string);
    }

    @Then("there error message is displayed for invalid password for registered email")
    public void thereErrorMessageIsDisplayedForInvalidPasswordForRegisteredEmail()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.err_not_Regis_email()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.err_not_Regis_email().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.err_not_Regis_email().getText().contains("Invalid login or password."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.err_not_Regis_email().getText());
    }

    @And("enter empty {string} for registered email")
    public void enterEmptyForRegisteredEmail(String string)
    {
        login_page.password().sendKeys(string);
    }

    @Then("there error message is displayed for empty password for registered email")
    public void thereErrorMessageIsDisplayedForEmptyPasswordForRegisteredEmail()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(login_page.err_emt_pass()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login_page.err_emt_pass().isDisplayed()); //here i assert by the welcome message is display
        softAssert.assertTrue(login_page.err_emt_pass().getText().contains("This is a required field."));//and also asset by that welcome message is contain the name of registered email
        softAssert.assertAll();
        System.out.println(login_page.err_emt_pass().getText());
    }
}
