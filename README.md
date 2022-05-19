# POC_Web_Selenium_Java_JUnit

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")
- [PageFactory](https://github.com/SeleniumHQ/selenium/wiki/PageFactory "PageFactory")
- [PageObject (pattern)](https://martinfowler.com/bliki/PageObject.html "PageObject")

### ChromeDriver

Faça o download do chromedriver adequado para o seu sistema operacional e adicione no diretório resources/drivers.
Local para download: https://chromedriver.chromium.org/downloads

### Configurações para o Linux Ubuntu:

Caso o Selenium não consiga iniciar o driver no linux para permissionar o chrome driver use o comando no terminal dentro da pasta do projeto resources/drivers:
```
chmod +x chromedriver
```

Instale as dependências do pom com Maven:
```
mvn clean install
```

Rode o comando para executar o teste de exemplo:
```
mvn test -Dtest=run
```
