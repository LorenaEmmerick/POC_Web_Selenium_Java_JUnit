package steps;

import io.cucumber.java.pt.*;
import util.TestRule;

public class Hooks {

    @Dado("que acesso o ecommerce")
    public void que_acesso_o_ecommerce() {
        String ecommerceUrl = "http://automationpractice.com";
        TestRule.abrirNavegador(ecommerceUrl);
    }
    @E("faço o Screenshot")
    public void faço_o_screenshot() {

    }

    @E("fecho o navegador")
    public void fecho_Browser(){

        }

}


