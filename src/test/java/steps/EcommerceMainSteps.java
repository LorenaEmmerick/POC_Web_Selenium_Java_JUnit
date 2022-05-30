package steps;

import org.junit.*;
import io.cucumber.java.pt.*;

import pages.EcommerceMainPage;

public class EcommerceMainSteps {

    @Quando("pesquiso o produto {string}")
    public void pesquiso_o_produto(String produto) {
        EcommerceMainPage ecommerceMainPage = new EcommerceMainPage();
        ecommerceMainPage.pesquisarProduto(produto);
    }

    @Entao("a pesquisa deve retornar resultados")
    public void validarQuePesquisaRetornouResultados(){
        EcommerceMainPage ecommerceMainPage = new EcommerceMainPage();
        Assert.assertTrue("O resultado da pesquisa está vazio.", ecommerceMainPage.isPesquisaRetornouResultados());
    }
}
