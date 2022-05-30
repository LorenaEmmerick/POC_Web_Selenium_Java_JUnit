#language: pt
#encoding: utf-8
@run
Funcionalidade: Pesquisa

  Contexto:
    Dado que acesso o ecommerce

  Cenario: Pesquisar produto
    Quando pesquiso o produto "t-shirt"
    Entao a pesquisa deve retornar resultados
    E Fecho o navegador

  Esquema do Cenario: Pesquisar produtos
    Quando pesquiso o produto <nome_produto>
    Entao a pesquisa deve retornar resultados
    E Fecho o navegador
    Exemplos:
      | nome_produto   |
      | "t-shirt"      |
      | "short"        |
      | "shoes"        |