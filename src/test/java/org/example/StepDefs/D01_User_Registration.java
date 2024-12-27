package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_User_Registration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class D01_User_Registration {
    P01_User_Registration register_page=new P01_User_Registration();

    @Given("user click on the Account button and select registratin")
    public void user_clic_on_the_Account_button_and_select_registratin()
    {
        register_page.account_btn().click();
        register_page.registration_btn().click();
    }

    @Then("redirct me to the registration page")
    public void redirctMeToTheRegistrationPage()
    {
//        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
//         wait.until(register_page.Form_registration().isDisplayed());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.Form_registration().isDisplayed(),"there are problem");
        soft.assertAll();
    }

    @When("user enter valid_F {string}")
    public void userEnterValidFirstName(String string)
    {
        register_page.FirstName().sendKeys(string);
    }

    @And("user enter valid_M {string}")
    public void userEnterValidMiddelName(String string)
    {
        register_page.MiddelName().sendKeys(string);
    }

    @And("user enter valid_L {string}")
    public void userEnterValidLastName(String string)
    {
        register_page.LastName().sendKeys(string);
    }

    @And("user enter valid_E {string}")
    public void userEnterValidEmail(String string)
    {
        register_page.Email().sendKeys(string);
    }

    @And("user enter valid_P {string}")
    public void userEnterValidPassword(String string)
    {
        register_page.password().sendKeys(string);
    }

    @And("enter valid_c_p {string}")
    public void enterValidConfirmPassword(String string) throws InterruptedException {
        register_page.Conf_password().sendKeys(string);

        Actions actions=new Actions(Hooks.driver);
        actions.scrollByAmount(0,500).pause(300).perform();
       // Thread.sleep(2000);
    }

    @And("click on the sign up button")
    public void clickOnTheSignUpButton() throws InterruptedException {
       // Thread.sleep(1000);
        register_page.register_Buttn().click();
    }

    @Then("the user can register successfully")
    public void theUserCanRegisterSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.registration_success().isDisplayed());
        soft.assertTrue(register_page.registration_success().getText().contains("Thank you for registering with Tealium Ecommerce."));
        soft.assertAll();
        System.out.println(register_page.registration_success().getText());
    }
//this methods for the invalid scenario
//user enter invalid firstname (more than 32 d once and less than 2 d once and enter number once and enter special chars once)
    @When("user enter invalid_F {string}")
    public void userEnterInvalid_F(String string)
    {
        register_page.FirstName().sendKeys(string);
    }
    //assert that error message that result from entering invalid firstname is display and contain on ("Tthe text must be contain 2-32 chars and (numbers and special chars) not allowed")
    @Then("an error message is diplaying under the field of the firstname the text must be contain 2-32 chars and numbers and special chars not allowed")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheFirsname()
    {
        //System.out.println(register_page.err_firstname_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_firstname_F().getText().contains("the text must be contain 2-32 chars and (numbers and special chars) not allowed"));
        soft.assertAll();
    }
//user enter empty value in firstname field
    @When("user enter empty_F {string}")
    public void userEnterEmpty_f(String string)
    {
      register_page.FirstName().sendKeys(string);
    }
//assert that error message that result from entering empty firstname  is display and contain on ("This is a required field.")
    @Then("an error message is diplaying under the field of the firstname and This is a required field")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheFirstnameandThisIsARequiredField()
    {
        System.out.println(register_page.err_firstname_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_firstname_F().getText().contains("This is a required field."));
        soft.assertAll();
    }
//the user enter invalid last name (more than 32 d once and less than 2 d once and enter number once and enter special chars once)
    @And("user enter invalid_L {string}")
    public void userEnterInvalid_L(String string)
    {
        register_page.LastName().sendKeys(string);
    }
    //assert that error message that result from entering invalid lastname is display and contain on ("The text must be contained 2-32 chars and (numbers and special chars) not allowed")
    @Then("an error message is diplaying under the field of the lastname the text must be contain chars and numbers and special chars not allowed")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheLastnameTheTextMustBeContainCharsAndNumbersAndSpecialCharsNotAllowed()
    {
        //System.out.println(register_page.err_lastname_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_lastname_F().isDisplayed());
        soft.assertTrue(register_page.err_lastname_F().getText().contains("the text must be contain chars and numbers and special chars not allowed"));
        soft.assertAll();
    }
//user enter empty value in lastname field
    @And("user enter empty_L {string}")
    public void userEnterEmpty_L(String string)
    {
        register_page.LastName().sendKeys(string);
    }
    //assert that error message that result from entering empty lastname  is display and contain on ("This is a required field.")
    @Then("an error message is diplaying under the field of the lastname and This is a required field")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheLastnameAndThisIsARequiredField()
    {
        System.out.println(register_page.err_lastname_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_lastname_F().isDisplayed());
        soft.assertTrue(register_page.err_lastname_F().getText().contains("This is a required field."));
        soft.assertAll();
    }


    @And("user enter invalid_E {string}")
    public void userEnterInvalid_E(String string)
    {
        register_page.Email().sendKeys(string);
    }

    @Then("an error message is diplaying under the field of the email invalid email")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheEmailInvalidEmail()
    {
        //System.out.println(register_page.err_invFormats_email().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_invFormats_email().isDisplayed());
        soft.assertTrue(register_page.err_invFormats_email().getText().contains("Please enter a valid email address. For example johndoe@domain.com."));
        soft.assertAll();
    }

    @And("user enter empty_E {string}")
    public void userEnterEmpty_E(String string)
    {
        register_page.Email().sendKeys(string);
    }

    @Then("an error message is diplaying under the field of the email and This is a required field")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheEmailAndThisIsARequiredField()
    {
        System.out.println(register_page.err_emt_email_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_emt_email_F().isDisplayed());
        soft.assertTrue(register_page.err_emt_email_F().getText().contains("This is a required field."));
        soft.assertAll();
    }

    @And("user enter exist_E {string}")
    public void userEnterExist_E(String string)
    {
        register_page.Email().sendKeys(string);
    }

    @Then("an error message is diplaying under the field of the email and There is already an account with this email address")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheEmailAndThereIsAlreadyAnAccountWithThisEmailAddress()
    {
        System.out.println(register_page.err_exist_email().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_exist_email().isDisplayed());
        soft.assertTrue(register_page.err_exist_email().getText().contains("There is already an account with this email address. If you are sure that it is your email address, "));
        soft.assertAll();
    }

    @And("user enter invalid_P {string}")
    public void userEnterInvalid_P(String string)
    {
        register_page.password().sendKeys(string);
    }

    @And("enter invalid_c_p {string} the same invalid password")
    public void enterInvalid_c_pTheSameInvalidPassword(String string)
    {
        register_page.Conf_password().sendKeys(string);
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,500).pause(300).perform();
    }

    @Then("an error message is diplaying under the field of the password and please enter more chars")
    public void anErrorMessageIsDiplayingUnderTheFieldOfThePasswordAndPleaseEnterMoreChars()
    {
        System.out.println(register_page.err_inv_pass_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_inv_pass_F().isDisplayed());
        soft.assertTrue(register_page.err_inv_pass_F().getText().contains("Please enter more characters or clean leading or trailing spaces."));
        soft.assertAll();
    }

    @And("enter invalid_c_p {string} differnce password")
    public void enterInvalid_c_pDifferncePassword(String string)
    {
        register_page.Conf_password().sendKeys(string);
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,500).pause(300).perform();
    }

    @Then("an error message is diplaying under the field of the confirm password and Please make sure your passwords match.")
    public void anErrorMessageIsDiplayingUnderTheFieldOfTheConfirmPasswordAndPleaseMakeSureYourPasswordsMatch()
    {
        System.out.println(register_page.err_diff_con_Pass_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_diff_con_Pass_F().isDisplayed());
        soft.assertTrue(register_page.err_diff_con_Pass_F().getText().contains("Please make sure your passwords match."));
        soft.assertAll();
    }

    @And("user enter empty_P {string}")
    public void userEnterEmpty_P(String string)
    {
        register_page.password().sendKeys(string);
    }

    @Then("an error message is diplaying under the field of password and This is required.")
    public void anErrorMessageIsDiplayingUnderTheFieldOfPasswordOrTheConfirmPasswordFieldAndThisIsRequired()
    {
        System.out.println(register_page.err_emt_pass_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_emt_pass_F().isDisplayed());
        soft.assertTrue(register_page.err_emt_pass_F().getText().contains("This is a required field."));
        soft.assertTrue(register_page.err_diff_con_Pass_F().isDisplayed());
        soft.assertTrue(register_page.err_diff_con_Pass_F().getText().contains("Please make sure your passwords match."));
        soft.assertAll();
    }

    @And("enter empty_c_p {string}")
    public void enterEmpty_c_p(String string)
    {
        register_page.Conf_password().sendKeys(string);
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,500).pause(300).perform();
    }

    @Then("an error message is diplaying under the field of confirm password and This is required.")
    public void anErrorMessageIsDiplayingUnderTheFieldOfConfirmPasswordAndThisIsRequired()
    {
        System.out.println(register_page.err_emt_conf_pass_F().getText());
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register_page.err_emt_conf_pass_F().isDisplayed());
        soft.assertTrue(register_page.err_emt_conf_pass_F().getText().contains("This is a required field."));
    }
}
