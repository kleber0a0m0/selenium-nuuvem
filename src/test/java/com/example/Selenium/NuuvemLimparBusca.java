package com.example.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class NuuvemLimparBusca {

    private void limparBusca() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kleber/Projetos/Selenium/chromedriver");
        NuuvemPesquisaRedDeadRedemption2 page = new NuuvemPesquisaRedDeadRedemption2();
        WebElement botaoLimparBusca = page.getLimparBusca();
        botaoLimparBusca.click();
        Assert.assertEquals("https://www.nuuvem.com/br-pt/catalog/page/1",page.driver.getCurrentUrl());
    }

    @Test
    public void testLimparBusca() throws InterruptedException {
        limparBusca();
    }
}
