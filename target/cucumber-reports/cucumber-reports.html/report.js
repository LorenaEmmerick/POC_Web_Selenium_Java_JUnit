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
  "duration": 4592373914,
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
formatter.step({
  "line": 13,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.match({
  "location": "EcommerceCartSteps.acesso_o_carrinho()"
});
formatter.result({
  "duration": 990817773,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceCartSteps.verifico_o_carrinho_vazio()"
});
formatter.result({
  "duration": 55006906,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.fecho_Browser()"
});
formatter.result({
  "duration": 88274403,
  "status": "passed"
});
formatter.uri("Pesquisa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 4,
  "name": "Pesquisa",
  "description": "",
  "id": "pesquisa",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
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
  "duration": 4721560105,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Pesquisar produto",
  "description": "",
  "id": "pesquisa;pesquisar-produto",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 10,
  "name": "pesquiso o produto \"t-shirt\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "a pesquisa deve retornar resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 12,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "t-shirt",
      "offset": 20
    }
  ],
  "location": "EcommerceMainSteps.pesquisarProduto(String)"
});
formatter.result({
  "duration": 2129130536,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceMainSteps.validarQuePesquisaRetornouResultados()"
});
formatter.result({
  "duration": 28108414,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.fecho_Browser()"
});
formatter.result({
  "duration": 84434721,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Pesquisar produtos",
  "description": "",
  "id": "pesquisa;pesquisar-produtos",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 15,
  "name": "pesquiso o produto \"\u003cnome_produto\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "a pesquisa deve retornar resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 17,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "pesquisa;pesquisar-produtos;",
  "rows": [
    {
      "cells": [
        "nome_produto"
      ],
      "line": 19,
      "id": "pesquisa;pesquisar-produtos;;1"
    },
    {
      "cells": [
        "t-shirt"
      ],
      "line": 20,
      "id": "pesquisa;pesquisar-produtos;;2"
    },
    {
      "cells": [
        "short"
      ],
      "line": 21,
      "id": "pesquisa;pesquisar-produtos;;3"
    },
    {
      "cells": [
        "shoes"
      ],
      "line": 22,
      "id": "pesquisa;pesquisar-produtos;;4"
    }
  ],
  "keyword": "Exemplos"
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
  "duration": 7749136126,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Pesquisar produtos",
  "description": "",
  "id": "pesquisa;pesquisar-produtos;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "pesquiso o produto \"t-shirt\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "a pesquisa deve retornar resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 17,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "t-shirt",
      "offset": 20
    }
  ],
  "location": "EcommerceMainSteps.pesquisarProduto(String)"
});
formatter.result({
  "duration": 1323291787,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceMainSteps.validarQuePesquisaRetornouResultados()"
});
formatter.result({
  "duration": 57274020,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.fecho_Browser()"
});
formatter.result({
  "duration": 105947856,
  "status": "passed"
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
  "duration": 5397000048,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Pesquisar produtos",
  "description": "",
  "id": "pesquisa;pesquisar-produtos;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "pesquiso o produto \"short\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "a pesquisa deve retornar resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 17,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "short",
      "offset": 20
    }
  ],
  "location": "EcommerceMainSteps.pesquisarProduto(String)"
});
formatter.result({
  "duration": 1733432937,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceMainSteps.validarQuePesquisaRetornouResultados()"
});
formatter.result({
  "duration": 35560584,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.fecho_Browser()"
});
formatter.result({
  "duration": 87705418,
  "status": "passed"
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
  "duration": 4150753112,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Pesquisar produtos",
  "description": "",
  "id": "pesquisa;pesquisar-produtos;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "pesquiso o produto \"shoes\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "a pesquisa deve retornar resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 17,
  "name": "Fecho o navegador",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "shoes",
      "offset": 20
    }
  ],
  "location": "EcommerceMainSteps.pesquisarProduto(String)"
});
formatter.result({
  "duration": 4005528623,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceMainSteps.validarQuePesquisaRetornouResultados()"
});
formatter.result({
  "duration": 30806636,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.fecho_Browser()"
});
formatter.result({
  "duration": 89480374,
  "status": "passed"
});
});