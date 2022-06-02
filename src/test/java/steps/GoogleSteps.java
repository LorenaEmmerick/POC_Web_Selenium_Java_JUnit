package steps;

        import io.cucumber.java.pt.*;
        import pages.GooglePage;

public class GoogleSteps {

        @Quando("pesquiso o item {string}")
        public void pesquiso_o_item(String item) {
                GooglePage googleMainPage = new GooglePage();
                googleMainPage.pesquisarItem(item);
        }

        @Entao("verifico as imagens")
        public void verifico_as_imagens() {
                GooglePage googleMainPage = new GooglePage();
                googleMainPage.verificoImagens();
        }

}
