package com.example.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NuuvemPesquisaTest {
    private void pesquisarPor(final String stringPesquisa){
        System.setProperty("webdriver.chrome.driver", "/home/kleber/Projetos/Selenium/chromedriver");

        NuuvemHomePage page = new NuuvemHomePage();

        WebElement botaoPesquisa = page.getButtonSearch();
        botaoPesquisa.click();
        WebElement campoPesquisado = page.getInputSearch();
        campoPesquisado.sendKeys(stringPesquisa);
        campoPesquisado.sendKeys(Keys.ENTER);

        System.out.println("===================================================\n" +
                "Jogo Pesquisado: " + stringPesquisa + "\n" +
                "Titulo do primeiro resultado: " + page.getTitleFirstResultCatalog() + "\n" +
                "'"+page.getTitleFirstResultCatalog() + "' contém '" + stringPesquisa + "'?" + (page.getTitleFirstResultCatalog().contains(stringPesquisa)?"Sim":"Não") + "\n" +
                "===================================================");

        Assert.assertTrue(page.getTitleFirstResultCatalog().contains(stringPesquisa));
    }

    @Test
    public void testPesquisarPorRedDeadRedemption2EVericarSeOTituloDoPrimeiroResultadoContemRedDeadRedemption2(){
        pesquisarPor("Red Dead Redemption 2");
    }



}