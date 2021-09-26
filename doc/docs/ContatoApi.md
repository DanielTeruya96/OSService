# ContatoApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contatosUsingGET**](ContatoApi.md#contatosUsingGET) | **GET** /contato/consultar | Consulta todos os contatos
[**insereContatoUsingPOST**](ContatoApi.md#insereContatoUsingPOST) | **POST** /contato/insereContato | Insere um contato
[**removeContatoUsingPUT**](ContatoApi.md#removeContatoUsingPUT) | **PUT** /contato/removeContato | Remove um contato


<a name="contatosUsingGET"></a>
# **contatosUsingGET**
> List&lt;ContatoResponse&gt; contatosUsingGET()

Consulta todos os contatos

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContatoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ContatoApi apiInstance = new ContatoApi(defaultClient);
    try {
      List<ContatoResponse> result = apiInstance.contatosUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContatoApi#contatosUsingGET");
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

[**List&lt;ContatoResponse&gt;**](ContatoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna lista de contato |  -  |
**403** | Token não encontrado! |  -  |
**500** | Erro não mapeado |  -  |

<a name="insereContatoUsingPOST"></a>
# **insereContatoUsingPOST**
> ContatoResponse insereContatoUsingPOST(token, contatoRequest)

Insere um contato

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContatoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ContatoApi apiInstance = new ContatoApi(defaultClient);
    String token = "852468245"; // String | Token de acesso
    ContatoRequest contatoRequest = new ContatoRequest(); // ContatoRequest | contatoRequest
    try {
      ContatoResponse result = apiInstance.insereContatoUsingPOST(token, contatoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContatoApi#insereContatoUsingPOST");
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
 **contatoRequest** | [**ContatoRequest**](ContatoRequest.md)| contatoRequest |

### Return type

[**ContatoResponse**](ContatoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retorna contato com o codigo do contato |  -  |
**500** | Erro não mapeado |  -  |

<a name="removeContatoUsingPUT"></a>
# **removeContatoUsingPUT**
> String removeContatoUsingPUT(contatoId, token)

Remove um contato

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContatoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ContatoApi apiInstance = new ContatoApi(defaultClient);
    String contatoId = "123"; // String | Codigo do contato
    String token = "852468245"; // String | Token de acesso
    try {
      String result = apiInstance.removeContatoUsingPUT(contatoId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContatoApi#removeContatoUsingPUT");
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
 **contatoId** | **String**| Codigo do contato |
 **token** | **String**| Token de acesso |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**500** | Erro não mapeado |  -  |

