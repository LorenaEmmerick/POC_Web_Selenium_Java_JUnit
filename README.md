# POC Web Selenium

>Projeto de exemplo para automações web, com Selenium, Java e Cucumber automatiza uma aplicação web e-commerce

## ⚒️ Recursos utilizados

### Tecnologias
- [Java](https://www.java.com/pt_BR/ "Java")
- [Maven](https://maven.apache.org/ "Maven")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")
- [PageFactory](https://github.com/SeleniumHQ/selenium/wiki/PageFactory "PageFactory")
- [PageObject (pattern)](https://martinfowler.com/bliki/PageObject.html "PageObject")
- [ExtentReportsAdapter](https://ghchirp.tech/2098/ "ExtentReportsAdapter")

### 💻 ChromeDriver

> Faça o download do chromedriver adequado para o seu sistema operacional e adicione no diretório resources/drivers.
> Local para download: https://chromedriver.chromium.org/downloads
> 
## 💻 Configurações para o Linux Ubuntu:

Caso o Selenium não consiga iniciar o driver no linux para permissionar o chrome driver use o comando no terminal dentro da pasta do projeto resources/drivers:
```
chmod +x chromedriver
```

Instale as dependências do pom com Maven:
```
mvn clean install
```
## 🏃 Escolha um runner
***Para escolher um runner, utilize os parâmetros:***

- ` Dtest=RunTest`
>Runner é onde vamos agrupar as tags do cucumber. Funciona como uma suite de teste.

## 💻 Escolha da Plataforma
**Em construção**

> Atualmente o browser padrão é o chrome (...) em construção para os demais browsers.


## 🚀 Execução dos Testes
Rode os comandos para executar o testes de exemplo:
```
mvn test
ou
mvn clean test -Dcucumber.filter.tags=@run
ou
mvn clean test -Dtest=RunTest
```
## 📜 Geração de relatórios

### Cucumber
O relatório JSON é gerado automaticamente dentro do diretório ``target/jsonReports``

### Extent Adapter
O relatórios são gerados automaticamente dentro do diretório ``test-output`` nos formatos HTML, JSON e PDF

[⬆ Voltar ao topo](#POC-Web-Selenium)<br>