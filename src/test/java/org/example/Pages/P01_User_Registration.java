package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_User_Registration {
    //locate the account button in the header of home page
    public WebElement account_btn()
    {
        return Hooks.driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]"));
    }
    //locate the registration button in the the dropdwon of account Button
   public WebElement registration_btn() {return Hooks.driver.findElement(By.cssSelector("div[class=\"links\"] a[title=\"Register\"]"));}
   //locate the form of the registration
    public WebElement Form_registration() {return Hooks.driver.findElement(By.cssSelector("div[class=\"account-create\"]"));}
    //locate the username filed
    public WebElement FirstName() {return Hooks.driver.findElement(By.id("firstname"));}
    //locate the MiddelName filed
    public WebElement MiddelName()
    {
        return Hooks.driver.findElement(By.id("middlename"));
    }
    //locate the LastName filed
    public WebElement LastName()
    {
        return Hooks.driver.findElement(By.id("lastname"));
    }
    //locate the email filed
    public WebElement Email()
    {
        return Hooks.driver.findElement(By.id("email_address"));
    }
    //locate password field
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("password"));
    }
    //locate confirm password field
    public WebElement Conf_password()
    {
        return Hooks.driver.findElement(By.id("confirmation"));
    }
    //locate register button
    public WebElement register_Buttn() {return Hooks.driver.findElement(By.cssSelector("button[title=\"Register\"]"));}
    //;ocate the message of the success of the operation of registration
    public WebElement registration_success(){return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/span[1]"));}
    //locate error message of field firstname;
    public WebElement err_firstname_F(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-firstname"));}
    //locate error message of field lastname;
    public WebElement err_lastname_F(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-lastname"));}
    //locate error message of email filed when the user enter empty email;
    public WebElement err_emt_email_F(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-email_address"));}
    //locate the error message of the invalid format email
    public WebElement err_invFormats_email(){return Hooks.driver.findElement(By.cssSelector("#advice-validate-email-email_address"));}
    //locate the error message of exist email
    public WebElement err_exist_email(){return Hooks.driver.findElement(By.cssSelector("li[class=\"error-msg\"]"));}
    //locate error message of field password when enter invalid pass;
    public WebElement err_inv_pass_F(){return Hooks.driver.findElement(By.cssSelector("#advice-validate-password-password"));}
    //locate error message of field confirm password when enter differnce pass;
    public WebElement err_diff_con_Pass_F(){return Hooks.driver.findElement(By.cssSelector("#advice-validate-cpassword-confirmation"));}

    //locate error message of the field password when the user enter empty password;
    public WebElement err_emt_pass_F(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-password"));}
    //locate error message of field confirm password;
    public WebElement err_emt_conf_pass_F(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-confirmation"));}


}
