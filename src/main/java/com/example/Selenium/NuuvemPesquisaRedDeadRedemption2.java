package com.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NuuvemPesquisaRedDeadRedemption2 extends Page{
    public NuuvemPesquisaRedDeadRedemption2(){
        super();
        driver.get("https://www.nuuvem.com/br-pt/catalog/page/1/search/red%20dead%20redemption%202");
    }


    public WebElement getFirstButtonAddToCart(){
        return driver.findElement(By.xpath("//*[@id=\"catalog\"]/div[3]/div[2]/div/div/div[1]/div/a/div[3]/div/button"));
    }
    public WebElement getLimparBusca(){
        return driver.findElement(By.xpath("//*[@id=\"catalog-search\"]/a"));
    }

    public String getTotalCart(){
        return driver.findElement(By.xpath("//*[@id=\"nvm-cart\"]/div/a/span")).getText();
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
