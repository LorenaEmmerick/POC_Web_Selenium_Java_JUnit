package steps;

import org.junit.*;
import io.cucumber.java.pt.*;

import pages.EcommerceCartPage;

public class EcommerceCartSteps {

    @Quando("acesso o carrinho")
    public void acessoCarrinho() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        ecommerceCartPage.acessarCarrinho();
    }

    @Entao("verifico o carrinho vazio")
    public void verificoCarrinhoVazio() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        Assert.assertEquals("Your shopping cart is empty.", ecommerceCartPage.isAlertaCarrinhoVazio());
    }

}
