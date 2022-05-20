package steps;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.EcommerceCartPage;



public class EcommerceCartSteps {

    @Quando("acesso o carrinho")
    public void acesso_o_carrinho() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        ecommerceCartPage.acessarCarrinho();
    }

    @Entao("verifico o carrinho vazio")
    public void verifico_o_carrinho_vazio() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        Assert.assertEquals("Your shopping cart is empty.", ecommerceCartPage.isAlertaCarrinhoVazio());
    }

}
