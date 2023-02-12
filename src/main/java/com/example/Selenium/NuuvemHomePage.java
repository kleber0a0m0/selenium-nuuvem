package com.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NuuvemHomePage extends Page{
    public NuuvemHomePage(){
        super();
        driver.get("https://www.nuuvem.com/br-pt/");
    }

    public WebElement getButtonSearch(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/header/div/div[3]/div/button"));
    }

    public WebElement getInputSearch(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/header/div/div[3]/div/input"));
    }

    public WebElement getAddtoCartFirstResultCatalog(){
        List<WebElement> elements = driver.findElements(By.cssSelector("product-btn-add-to-cart product-btn-add-to-cart__with_price btn-conversion nvm-btn"));
        if (elements.isEmpty()) {
            return null;
        }
        WebElement firstElement = elements.get(0);
        return firstElement;
    }

    public String getTitleFirstResultCatalog(){
        List<WebElement> elements = driver.findElements(By.cssSelector(".product-title.double-line-name"));
        if (elements.isEmpty()) {
            return "Null";
        }
        WebElement firstElement = elements.get(0);
        return firstElement.getText();
    }


    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
