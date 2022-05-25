$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Carrinho.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    },
    {
      "line": 3,
      "value": "#@run"
    }
  ],
  "line": 4,
  "name": "Carrinho",
  "description": "",
  "id": "carrinho",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que acesso o ecommerce",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.acessarEcommerce()"
});
formatter.result({
  "duration": 4162616863,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Carrinho vazio",
  "description": "",
  "id": "carrinho;carrinho-vazio",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@run1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "acesso o carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "verifico o carrinho vazio",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceCartSteps.acesso_o_carrinho()"
});
formatter.result({
  "duration": 1267003512,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceCartSteps.verifico_o_carrinho_vazio()"
});
formatter.result({
  "duration": 32601812,
  "status": "passed"
});
});