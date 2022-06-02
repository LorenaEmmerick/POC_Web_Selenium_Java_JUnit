package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends GooglePageElementMap {

    public GooglePage(){
        PageFactory.initElements(driver, this);
    }

    public void pesquisarItem(String item){
        txtPesquisarItem.sendKeys(item);
        txtPesquisarItem.sendKeys(Keys.ENTER);
    }

    public void verificoImagens(){
        System.out.println("Imagens de gatinhos ...");
    }

}
