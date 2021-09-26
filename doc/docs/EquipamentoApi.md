# EquipamentoApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alterarEquipamentoUsingPUT**](EquipamentoApi.md#alterarEquipamentoUsingPUT) | **PUT** /equipamento/alterar | Altera um equipamento que ja exite
[**consultarEquipamentoUsingGET**](EquipamentoApi.md#consultarEquipamentoUsingGET) | **GET** /equipamento/consultar | Consulta todas balancas
[**inserirEquipamentoUsingPOST**](EquipamentoApi.md#inserirEquipamentoUsingPOST) | **POST** /equipamento/cadastrar | Cadastrar um equipamento
[**removerEquipamentoUsingDELETE**](EquipamentoApi.md#removerEquipamentoUsingDELETE) | **DELETE** /equipamento/remover | deleta um equipamento que ja exite


<a name="alterarEquipamentoUsingPUT"></a>
# **alterarEquipamentoUsingPUT**
> EquipamentoResponse alterarEquipamentoUsingPUT(token, equipamentoRequest)

Altera um equipamento que ja exite

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EquipamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EquipamentoApi apiInstance = new EquipamentoApi(defaultClient);
    String token = "token_example"; // String | token
    EquipamentoRequest equipamentoRequest = new EquipamentoRequest(); // EquipamentoRequest | equipamentoRequest
    try {
      EquipamentoResponse result = apiInstance.alterarEquipamentoUsingPUT(token, equipamentoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipamentoApi#alterarEquipamentoUsingPUT");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **equipamentoRequest** | [**EquipamentoRequest**](EquipamentoRequest.md)| equipamentoRequest |

### Return type

[**EquipamentoResponse**](EquipamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna info do equipamento |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="consultarEquipamentoUsingGET"></a>
# **consultarEquipamentoUsingGET**
> List&lt;EquipamentoResponse&gt; consultarEquipamentoUsingGET(token)

Consulta todas balancas

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EquipamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EquipamentoApi apiInstance = new EquipamentoApi(defaultClient);
    String token = "852468245"; // String | Token de acesso
    try {
      List<EquipamentoResponse> result = apiInstance.consultarEquipamentoUsingGET(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipamentoApi#consultarEquipamentoUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token de acesso |

### Return type

[**List&lt;EquipamentoResponse&gt;**](EquipamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna lista de balanca |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="inserirEquipamentoUsingPOST"></a>
# **inserirEquipamentoUsingPOST**
> EquipamentoResponse inserirEquipamentoUsingPOST(token, equipamentoRequest)

Cadastrar um equipamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EquipamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EquipamentoApi apiInstance = new EquipamentoApi(defaultClient);
    String token = "token_example"; // String | token
    EquipamentoRequest equipamentoRequest = new EquipamentoRequest(); // EquipamentoRequest | equipamentoRequest
    try {
      EquipamentoResponse result = apiInstance.inserirEquipamentoUsingPOST(token, equipamentoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipamentoApi#inserirEquipamentoUsingPOST");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **equipamentoRequest** | [**EquipamentoRequest**](EquipamentoRequest.md)| equipamentoRequest |

### Return type

[**EquipamentoResponse**](EquipamentoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna info dos equipamento |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="removerEquipamentoUsingDELETE"></a>
# **removerEquipamentoUsingDELETE**
> String removerEquipamentoUsingDELETE(equipamentoId, token)

deleta um equipamento que ja exite

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EquipamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EquipamentoApi apiInstance = new EquipamentoApi(defaultClient);
    Integer equipamentoId = 56; // Integer | equipamentoId
    String token = "token_example"; // String | token
    try {
      String result = apiInstance.removerEquipamentoUsingDELETE(equipamentoId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipamentoApi#removerEquipamentoUsingDELETE");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **equipamentoId** | **Integer**| equipamentoId |
 **token** | **String**| token |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna \&quot;OK\&quot;  |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

