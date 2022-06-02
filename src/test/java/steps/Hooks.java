package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.HooksPage;
import util.TestRule;


public class Hooks {

    @Dado("que acesso o ecommerce")
    public void que_acesso_o_ecommerce() {
        String ecommerceUrl = "http://automationpractice.com";
        HooksPage.abrirNavegador(ecommerceUrl);
        HooksPage.waitOf(60);
    }

    @Dado("que acesso Google")
    public void que_acesso_google() {
        String GoogleUrl = "https://www.google.com/";
        HooksPage.abrirNavegador(GoogleUrl);
        HooksPage.waitOf(60);
    }

    @E("fecho o navegador")
    public void fecho_Browser(){
        TestRule.afterScenario();
    }

    @AfterStep
    public void faço_o_screenshot2(){
        System.out.println("Capture Screenshot :D ... :D ... :D ... :D ...");
    }
    @After
    public void afterCloseBrowser(){
        System.out.println("Fecha TUDOOOO :D ... :D ... :D ... :D ...");
        TestRule.afterScenario();
    }

//    @AfterStep
//    public void faço_o_screenshot2(){
//        TestRule.TakeScreenshot(Scenario);
//    }



}


