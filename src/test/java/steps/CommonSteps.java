package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o ecommerce")
    public void acessarEcommerce(){
        String ecommerceUrl = "http://automationpractice.com";
        TestRule.abrirNavegador(ecommerceUrl);
    }

    @E("Fecho o navegador")
    public void fecho_Browser(){
        TestRule.afterScenario();
        }

}


