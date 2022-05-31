package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.pt.*;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o ecommerce")
    public void acessarEcommerce(){
        String ecommerceUrl = "http://automationpractice.com";
        TestRule.abrirNavegador(ecommerceUrl);
    }
//    @E("Faço o Screenshot")
//    public void faço_o_screenshot(Scenario scenario) {
//       TestRule.TakeScreenshot(scenario);
//    }

    @E("Fecho o navegador")
    public void fecho_Browser(){
        TestRule.afterScenario();
        }

}


