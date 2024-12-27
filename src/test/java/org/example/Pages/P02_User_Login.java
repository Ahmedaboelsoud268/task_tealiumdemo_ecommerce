package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P02_User_Login {
    //locate the account button in the header of home page
    public WebElement account_btn()
    {
        return Hooks.driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]"));
    }
    //locate all the element in the dropdown of the account button to select the login button by the index;;
    public List<WebElement> lists_of_account(){
        List<WebElement> lists=Hooks.driver.findElements(By.cssSelector("div[id=\"header-account\"] li"));
        return lists;
    }
//locate the login page to assert it
public WebElement login_page(){return Hooks.driver.findElement(By.cssSelector("div[class=\"content fieldset\"]"));}
//locate email field
    public WebElement email(){return Hooks.driver.findElement(By.cssSelector("#email"));}
    //locate the password filed
    public WebElement password(){return Hooks.driver.findElement(By.cssSelector("#pass"));}
    //locate the login button
    public WebElement login_btn(){return Hooks.driver.findElement(By.cssSelector("button[id=\"send2\"]"));}
    //locate the message of the success of the operation of registration
    public WebElement login_success(){return Hooks.driver.findElement(By.cssSelector("body.customer-account-index.customer-account:nth-child(2) div.wrapper:nth-child(4) div.page:nth-child(2) div.main-container.col2-left-layout div.main div.col-main:nth-child(2) div.my-account div.dashboard div.page-title:nth-child(1) > h1:nth-child(1)"));}
    //locate the error message when user enter invalid email
    public WebElement err_invalid_email(){return Hooks.driver.findElement(By.cssSelector("div[id=\"advice-validate-email-email\"]"));}
    //locate the error message when user enter empty email
    public WebElement err_empty_email(){return Hooks.driver.findElement(By.id("advice-required-entry-email"));}
    //locate the error message when user enter not registered email
    public WebElement err_not_Regis_email(){return Hooks.driver.findElement(By.cssSelector("li[class=\"error-msg\"]"));}
    //locate an error message when user enter empty password
    public WebElement err_emt_pass(){return Hooks.driver.findElement(By.cssSelector("#advice-required-entry-pass"));}
    //locate an error message when user enter less than required
   // public WebElement less_than_reqPass(){return Hooks.driver.findElement(By.cssSelector(""));}











}
