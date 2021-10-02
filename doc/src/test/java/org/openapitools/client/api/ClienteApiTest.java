/*
 * OS serive REST API
 * Documentação da API do OS service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ClientRequest;
import org.openapitools.client.model.ClienteResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClienteApi
 */
@Ignore
public class ClienteApiTest {

    private final ClienteApi api = new ClienteApi();

    
    /**
     * Consulta todos clientes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void consultarUsingGETTest() throws ApiException {
        List<ClienteResponse> response = api.consultarUsingGET();

        // TODO: test validations
    }
    
    /**
     * Insere cliente
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insereClienteUsingPOSTTest() throws ApiException {
        String token = null;
        ClientRequest clienteRequest = null;
        ClienteResponse response = api.insereClienteUsingPOST(token, clienteRequest);

        // TODO: test validations
    }
    
    /**
     * Remove um cliente
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removerClienteUsingPUTTest() throws ApiException {
        String clienteId = null;
        String token = null;
        String response = api.removerClienteUsingPUT(clienteId, token);

        // TODO: test validations
    }
    
}