# Consulta frete

Este é um projeto simples que permite a consulta de endereços utilizando o CEP. 

Ele utiliza a API gratuita do ViaCEP para obter as informações do endereço a partir do CEP fornecido pelo usuário.

# Tecnologias Utilizadas
* Java 11
* Spring Boot
* Maven
* Swagger
* Cucumber
* JUnit 5

# Como Executar
Para executar o projeto, siga os seguintes passos:

1 - Clone o repositório em sua máquina local. 

2 - Abra o terminal e navegue até a pasta do projeto.

3 - Execute o comando mvn clean install para baixar as dependências e gerar o pacote jar.

4 - Execute o comando java -jar target/consulta-frete.jar para iniciar a aplicação.

5 - Acesse o Swagger através do endereço http://localhost:8080/swagger-ui.html para visualizar a documentação e testar os endpoints.
Endpoints


### Request body:
```json
{
  "cep": "00000-000"
} 
```

### Response body:
```json
{
  "cep": "00000-000",
  "logradouro": "Rua Exemplo",
  "bairro": "Bairro Exemplo",
  "localidade": "Cidade Exemplo",
  "uf": "UF",
  "ibge": "0000000"
}
``` 

# Documentação

A documentação dos endpoints pode ser acessada através do Swagger, que é uma ferramenta que permite a documentação, teste e visualização dos endpoints de uma aplicação.

Para acessar o Swagger, execute o projeto e acesse o endereço http://localhost:8080/swagger-ui.html.

# Testes

Foram criados testes unitários para as classes de serviço e testes de integração utilizando o Cucumber para testar os endpoints da aplicação. Para executar os testes, basta executar o comando mvn test. Os relatórios de testes são gerados na pasta target/cucumber-html-report.




