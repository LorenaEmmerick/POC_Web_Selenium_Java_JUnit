package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

import pages.HooksPage;
import util.TestRule;


public class Hooks {

    @Dado("que acesso o ecommerce")
    public void accessEcommerce() {
        String ecommerceUrl = "http://automationpractice.com";
        HooksPage.abrirNavegador(ecommerceUrl);
        HooksPage.waitOf(60);
    }

    @Dado("que acesso Google")
    public void accessGoogle() {
        String GoogleUrl = "https://www.google.com/";
        HooksPage.abrirNavegador(GoogleUrl);
        HooksPage.waitOf(60);
    }

    @E("fecho o navegador")
    public void closeBrowser(){
        TestRule.afterScenario();
    }

    @AfterStep
    public void TakeScreenshot(){
        System.out.println("Take Screenshot :D ... :D ... :D ... :D ... Tem que implementar");
    }
// TODO Implementar Take Screenshot
    @After
    public void tearDown(){
        System.out.println("Fecha TUDOOOO :D ... :D ... :D ... :D ...");
        TestRule.afterScenario();
    }

}


