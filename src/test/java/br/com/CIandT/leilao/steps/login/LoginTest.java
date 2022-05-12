package br.com.CIandT.leilao.steps.login;

import static org.junit.Assert.*;
import br.com.CIandT.leilao.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.CIandT.leilao.pages.lance.LancesPage;



public class LoginTest {

	private LoginPage paginaDeLogin;

	@BeforeEach
	public void beforeEach() {
		this.paginaDeLogin = new LoginPage();
	}

	@AfterEach
	public void afterEach() {
		this.paginaDeLogin.fechar();
	}

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		paginaDeLogin.efetuarLogin("fulano", "pass");

		String nomeUsuarioLogado = paginaDeLogin.getNomeUsuarioLogado();
		Assertions.assertEquals("fulano", nomeUsuarioLogado);
		Assertions.assertFalse(paginaDeLogin.isPaginaAtual());
	}

	@Test
	public void naoDeveriaEfetuarLoginComDadosInvalidos() {
		paginaDeLogin.efetuarLogin("invalido", "1233");

		Assertions.assertNull(paginaDeLogin.getNomeUsuarioLogado());
		Assertions.assertTrue(paginaDeLogin.isPaginaAtual());
		Assertions.assertTrue(paginaDeLogin.isMensagemDeLoginInvalidoVisivel());
	}

	@Test
	public void naoDeveriaAcessarUrlRestritaSemEstarLogado() {
		LancesPage paginaDeLances = new LancesPage();

		Assertions.assertFalse(paginaDeLances.isPaginaAtual());
		Assertions.assertFalse(paginaDeLances.isTituloLeilaoVisivel());

		paginaDeLances.fechar();
	}

}
