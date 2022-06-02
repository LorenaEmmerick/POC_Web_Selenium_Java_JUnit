package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcommerceCartPageElementMap extends HooksPage {

        @FindBy(css = "a[title='View my shopping cart']")
        protected WebElement btnCarrinho;

        @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
        protected WebElement alertaCarrinhoVazio;

    }

