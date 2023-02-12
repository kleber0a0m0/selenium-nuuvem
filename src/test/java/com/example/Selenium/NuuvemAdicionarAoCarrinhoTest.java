package com.example.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class NuuvemAdicionarAoCarrinhoTest {

    private void adicionarNoCarrinho() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kleber/Projetos/Selenium/chromedriver");

        NuuvemPesquisaRedDeadRedemption2 page = new NuuvemPesquisaRedDeadRedemption2();
        WebElement adicionarAocarrinho = page.getFirstButtonAddToCart();
        Assert.assertTrue(page.getTotalCart().equals("0"));
        adicionarAocarrinho.click();
        Thread.sleep(5000);
        Assert.assertTrue(page.getTotalCart().equals("1"));


    }

    @Test
    public void testPesquisarPorRedDeadRedemption2EVericarSeOTituloDoPrimeiroResultadoContemRedDeadRedemption2() throws InterruptedException {
        adicionarNoCarrinho();
    }
}