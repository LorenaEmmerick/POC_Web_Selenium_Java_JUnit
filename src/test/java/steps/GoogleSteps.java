package steps;

import io.cucumber.java.pt.*;

import pages.GooglePage;

public class GoogleSteps {

        @Quando("pesquiso o item {string}")
        public void pesquisoItem(String item) {
                GooglePage googleMainPage = new GooglePage();
                googleMainPage.pesquisarItem(item);
        }

        @Entao("verifico as imagens")
        public void verificoImagens() {
                GooglePage googleMainPage = new GooglePage();
                googleMainPage.verificoImagens();
        }

}
