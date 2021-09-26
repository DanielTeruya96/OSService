# ClienteApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consultarUsingGET**](ClienteApi.md#consultarUsingGET) | **GET** /cliente/consultar | Consulta todos clientes
[**insereClienteUsingPOST**](ClienteApi.md#insereClienteUsingPOST) | **POST** /cliente/insereCliente | Insere cliente
[**removerClienteUsingPUT**](ClienteApi.md#removerClienteUsingPUT) | **PUT** /cliente/removerCliente | Remove um cliente


<a name="consultarUsingGET"></a>
# **consultarUsingGET**
> List&lt;ClienteResponse&gt; consultarUsingGET()

Consulta todos clientes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApi apiInstance = new ClienteApi(defaultClient);
    try {
      List<ClienteResponse> result = apiInstance.consultarUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApi#consultarUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClienteResponse&gt;**](ClienteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna lista de clientes |  -  |
**403** | Token não encontrado! |  -  |
**500** | Erro não mapeado |  -  |

<a name="insereClienteUsingPOST"></a>
# **insereClienteUsingPOST**
> ClienteResponse insereClienteUsingPOST(token, clienteRequest)

Insere cliente

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApi apiInstance = new ClienteApi(defaultClient);
    String token = "852468245"; // String | Token de acesso
    ClientRequest clienteRequest = new ClientRequest(); // ClientRequest | clienteRequest
    try {
      ClienteResponse result = apiInstance.insereClienteUsingPOST(token, clienteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApi#insereClienteUsingPOST");
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
 **clienteRequest** | [**ClientRequest**](ClientRequest.md)| clienteRequest |

### Return type

[**ClienteResponse**](ClienteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna Cliente cadastrado |  -  |
**500** | Erro não mapeado |  -  |

<a name="removerClienteUsingPUT"></a>
# **removerClienteUsingPUT**
> String removerClienteUsingPUT(clienteId, token)

Remove um cliente

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClienteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClienteApi apiInstance = new ClienteApi(defaultClient);
    String clienteId = "123"; // String | Codigo do contato
    String token = "852468245"; // String | Token de acesso
    try {
      String result = apiInstance.removerClienteUsingPUT(clienteId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClienteApi#removerClienteUsingPUT");
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
 **clienteId** | **String**| Codigo do contato |
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
**200** | Ok |  -  |
**500** | Erro não mapeado |  -  |

