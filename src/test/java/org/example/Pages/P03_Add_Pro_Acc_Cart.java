package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Add_Pro_Acc_Cart {
    // public WebElement (){return Hooks.driver.findElement(By.cssSelector(""));}
    //locate the the accessories
    public WebElement accessories(){return Hooks.driver.findElement(By.cssSelector("div[class=\"skip-content\"] li[class=\"level0 nav-3 parent\"]"));}
    //locate the the shoes in accessories
    public WebElement shoes(){return Hooks.driver.findElement(By.cssSelector("ul[class=\"level0\"] li[class=\"level1 nav-3-3\"]"));}
    //locate the filter by price
    public List<WebElement> lists_Filter_by_price(){
        List<WebElement> lists=Hooks.driver.findElements(By.cssSelector("dd[class=\"odd\"] li"));
        return lists;
    }
    //locate the view details
    public WebElement viewDetails(){return Hooks.driver.findElement(By.cssSelector("div[class=\"actions\"] a[title=\"View Details\"]"));}
    //locate the color
    public WebElement color(){return Hooks.driver.findElement(By.cssSelector("li[id=\"option17\"] span[class=\"swatch-label\"]"));}
    //locate the size
    public WebElement size(){return Hooks.driver.findElement(By.cssSelector("ul[id=\"configurable_swatch_shoe_size\"] li[class=\"option-9\"]"));}
   //locate the add to cart
    public WebElement addToCart(){return Hooks.driver.findElement(By.cssSelector("div[class=\"add-to-cart-buttons\"] button[title=\"Add to Cart\"]"));}
   // public WebElement theCart(){return Hooks.driver.findElement(By.cssSelector("div[class=\"header-minicart\"]"));}
    public WebElement popMessageAddedProd(){return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Hana Flat, Charcoal was added to your shopping car')]"));}

}
