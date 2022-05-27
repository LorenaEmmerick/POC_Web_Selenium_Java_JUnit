#language: pt
#encoding: utf-8
#@run
Funcionalidade: Carrinho

  Contexto:
    Dado que acesso o ecommerce

  @run1
  Cenario: Carrinho vazio
    Quando acesso o carrinho
    Entao verifico o carrinho vazio
    E Fecho o navegador
