# openapi-java-client

OS serive REST API
- API version: 1.0.0
  - Build date: 2021-09-26T16:38:53.309911-04:00[America/Havana]

Documentação da API do OS service


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalancaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    BalancaApi apiInstance = new BalancaApi(defaultClient);
    String token = "token_example"; // String | token
    BalancaRequest request = new BalancaRequest(); // BalancaRequest | request
    try {
      BalancaResponse result = apiInstance.alterarResponseUsingPUT(token, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancaApi#alterarResponseUsingPUT");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalancaApi* | [**alterarResponseUsingPUT**](docs/BalancaApi.md#alterarResponseUsingPUT) | **PUT** /balanca/alterar | Altera uma balanca que ja exite
*BalancaApi* | [**consultarBalancaUsingGET**](docs/BalancaApi.md#consultarBalancaUsingGET) | **GET** /balanca/consultar | Consulta todas balancas
*BalancaApi* | [**inserirnovaBalancaUsingPOST**](docs/BalancaApi.md#inserirnovaBalancaUsingPOST) | **POST** /balanca/cadastrar | Cria uma nova balanca
*BalancaApi* | [**removerBalancaUsingDELETE**](docs/BalancaApi.md#removerBalancaUsingDELETE) | **DELETE** /balanca/remover | removerBalanca
*ClienteApi* | [**consultarUsingGET**](docs/ClienteApi.md#consultarUsingGET) | **GET** /cliente/consultar | Consulta todos clientes
*ClienteApi* | [**insereClienteUsingPOST**](docs/ClienteApi.md#insereClienteUsingPOST) | **POST** /cliente/insereCliente | Insere cliente
*ClienteApi* | [**removerClienteUsingPUT**](docs/ClienteApi.md#removerClienteUsingPUT) | **PUT** /cliente/removerCliente | Remove um cliente
*ContatoApi* | [**contatosUsingGET**](docs/ContatoApi.md#contatosUsingGET) | **GET** /contato/consultar | Consulta todos os contatos
*ContatoApi* | [**insereContatoUsingPOST**](docs/ContatoApi.md#insereContatoUsingPOST) | **POST** /contato/insereContato | Insere um contato
*ContatoApi* | [**removeContatoUsingPUT**](docs/ContatoApi.md#removeContatoUsingPUT) | **PUT** /contato/removeContato | Remove um contato
*EquipamentoApi* | [**alterarEquipamentoUsingPUT**](docs/EquipamentoApi.md#alterarEquipamentoUsingPUT) | **PUT** /equipamento/alterar | Altera um equipamento que ja exite
*EquipamentoApi* | [**consultarEquipamentoUsingGET**](docs/EquipamentoApi.md#consultarEquipamentoUsingGET) | **GET** /equipamento/consultar | Consulta todas balancas
*EquipamentoApi* | [**inserirEquipamentoUsingPOST**](docs/EquipamentoApi.md#inserirEquipamentoUsingPOST) | **POST** /equipamento/cadastrar | Cadastrar um equipamento
*EquipamentoApi* | [**removerEquipamentoUsingDELETE**](docs/EquipamentoApi.md#removerEquipamentoUsingDELETE) | **DELETE** /equipamento/remover | deleta um equipamento que ja exite


## Documentation for Models

 - [BalancaRequest](docs/BalancaRequest.md)
 - [BalancaResponse](docs/BalancaResponse.md)
 - [ClientRequest](docs/ClientRequest.md)
 - [ClienteResponse](docs/ClienteResponse.md)
 - [ContatoRequest](docs/ContatoRequest.md)
 - [ContatoResponse](docs/ContatoResponse.md)
 - [EquipamentoRequest](docs/EquipamentoRequest.md)
 - [EquipamentoResponse](docs/EquipamentoResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


