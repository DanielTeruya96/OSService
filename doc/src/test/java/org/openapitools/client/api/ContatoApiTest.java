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
import org.openapitools.client.model.ContatoRequest;
import org.openapitools.client.model.ContatoResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContatoApi
 */
@Ignore
public class ContatoApiTest {

    private final ContatoApi api = new ContatoApi();

    
    /**
     * Consulta todos os contatos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contatosUsingGETTest() throws ApiException {
        List<ContatoResponse> response = api.contatosUsingGET();

        // TODO: test validations
    }
    
    /**
     * Insere um contato
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insereContatoUsingPOSTTest() throws ApiException {
        String token = null;
        ContatoRequest contatoRequest = null;
        ContatoResponse response = api.insereContatoUsingPOST(token, contatoRequest);

        // TODO: test validations
    }
    
    /**
     * Remove um contato
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeContatoUsingPUTTest() throws ApiException {
        String contatoId = null;
        String token = null;
        String response = api.removeContatoUsingPUT(contatoId, token);

        // TODO: test validations
    }
    
}