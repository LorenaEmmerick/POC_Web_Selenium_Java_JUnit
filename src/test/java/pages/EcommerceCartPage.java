package pages;

import elements.EcommerceCartPageElementMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceCartPage extends EcommerceCartPageElementMap {

    public EcommerceCartPage(){ PageFactory.initElements(driver, this);}

    public void acessarCarrinho(){
        btnCarrinho.click();
        new WebDriverWait(driver, 60);

    }

    public String isAlertaCarrinhoVazio(){
        return alertaCarrinhoVazio.getText();
    }


}
