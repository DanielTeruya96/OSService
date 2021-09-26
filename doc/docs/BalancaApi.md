# BalancaApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alterarResponseUsingPUT**](BalancaApi.md#alterarResponseUsingPUT) | **PUT** /balanca/alterar | Altera uma balanca que ja exite
[**consultarBalancaUsingGET**](BalancaApi.md#consultarBalancaUsingGET) | **GET** /balanca/consultar | Consulta todas balancas
[**inserirnovaBalancaUsingPOST**](BalancaApi.md#inserirnovaBalancaUsingPOST) | **POST** /balanca/cadastrar | Cria uma nova balanca
[**removerBalancaUsingDELETE**](BalancaApi.md#removerBalancaUsingDELETE) | **DELETE** /balanca/remover | removerBalanca


<a name="alterarResponseUsingPUT"></a>
# **alterarResponseUsingPUT**
> BalancaResponse alterarResponseUsingPUT(token, request)

Altera uma balanca que ja exite

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **request** | [**BalancaRequest**](BalancaRequest.md)| request |

### Return type

[**BalancaResponse**](BalancaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna info da balanca |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="consultarBalancaUsingGET"></a>
# **consultarBalancaUsingGET**
> List&lt;BalancaResponse&gt; consultarBalancaUsingGET(token)

Consulta todas balancas

### Example
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
    String token = "852468245"; // String | Token de acesso
    try {
      List<BalancaResponse> result = apiInstance.consultarBalancaUsingGET(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancaApi#consultarBalancaUsingGET");
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

[**List&lt;BalancaResponse&gt;**](BalancaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna lista de balanca |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="inserirnovaBalancaUsingPOST"></a>
# **inserirnovaBalancaUsingPOST**
> BalancaResponse inserirnovaBalancaUsingPOST(token, request)

Cria uma nova balanca

### Example
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
      BalancaResponse result = apiInstance.inserirnovaBalancaUsingPOST(token, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancaApi#inserirnovaBalancaUsingPOST");
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
 **request** | [**BalancaRequest**](BalancaRequest.md)| request |

### Return type

[**BalancaResponse**](BalancaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna info da balanca |  -  |
**403** | Erro de autenticacao |  -  |
**500** | Erro não mapeado |  -  |

<a name="removerBalancaUsingDELETE"></a>
# **removerBalancaUsingDELETE**
> String removerBalancaUsingDELETE(balancaId, token)

removerBalanca

### Example
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
    String balancaId = "123"; // String | Codigo da balanca
    String token = "852468245"; // String | Token de acesso
    try {
      String result = apiInstance.removerBalancaUsingDELETE(balancaId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancaApi#removerBalancaUsingDELETE");
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
 **balancaId** | **String**| Codigo da balanca |
 **token** | **String**| Token de acesso |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

