#language: pt
#encoding: utf-8
#@run
Funcionalidade: Google

  Contexto:
    Dado que acesso Google

  @run2
  Cenario: Pesquisa Google
    Quando pesquiso o item "Gatinhos"
    Entao verifico as imagens