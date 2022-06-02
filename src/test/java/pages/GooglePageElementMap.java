package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageElementMap extends HooksPage {

    @FindBy(css = "input[title='Pesquisar']")
    public static WebElement txtPesquisarItem;

}
