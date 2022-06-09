package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HooksPage;

public class GooglePageElementMap extends HooksPage {

    @FindBy(css = "input[title='Pesquisar']")
    public static WebElement txtPesquisarItem;

}
