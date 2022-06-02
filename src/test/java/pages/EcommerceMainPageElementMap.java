package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcommerceMainPageElementMap extends HooksPage {

    @FindBy(id = "search_query_top")
    public static WebElement txtPesquisarProduto;

    @FindBy(name = "submit_search")
    protected static WebElement btnPesquisarProduto;

    @FindBy(css = ".heading-counter")
    protected WebElement lblQtdResultadosEncontrados;

}
