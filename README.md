# POC_Web_Selenium_Java_JUnit

Configurações para o Linux Ubuntu:
Baixar o driver do browser e colocar na pasta de drivers dentro do projeto (chrome driver)
Instalar as dependências do pom com mvn
```
mvn install
```

No linux para permissionar o chrome driver para execução pelo selenium use o comando no terminal dentro da pasta do projeto leilao/drivers
```
chmod +x chromedriver
```

Para rodar o testes de exemplo com selenium antes suba a aplicação local em : http://localhost:8080/leiloes
```
acesse src > java > br.com.CIandT.leilao > Run na classe 'LeilaoAplication'
```

Após a aplicação funcionando em ambiente local
Rode o comando para executar os testes de exemplo
```
mvn test
```
