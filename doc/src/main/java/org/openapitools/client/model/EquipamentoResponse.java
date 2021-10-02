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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EquipamentoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-26T16:38:53.309911-04:00[America/Havana]")
public class EquipamentoResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MARCA = "marca";
  @SerializedName(SERIALIZED_NAME_MARCA)
  private String marca;

  public static final String SERIALIZED_NAME_MODELO = "modelo";
  @SerializedName(SERIALIZED_NAME_MODELO)
  private String modelo;

  public static final String SERIALIZED_NAME_NOME = "nome";
  @SerializedName(SERIALIZED_NAME_NOME)
  private String nome;


  public EquipamentoResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * codigo do equipamento
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "codigo do equipamento")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public EquipamentoResponse marca(String marca) {
    
    this.marca = marca;
    return this;
  }

   /**
   * marca do equipamento
   * @return marca
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kajsdhajdskg", value = "marca do equipamento")

  public String getMarca() {
    return marca;
  }


  public void setMarca(String marca) {
    this.marca = marca;
  }


  public EquipamentoResponse modelo(String modelo) {
    
    this.modelo = modelo;
    return this;
  }

   /**
   * modelo do equipamento
   * @return modelo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "auau", value = "modelo do equipamento")

  public String getModelo() {
    return modelo;
  }


  public void setModelo(String modelo) {
    this.modelo = modelo;
  }


  public EquipamentoResponse nome(String nome) {
    
    this.nome = nome;
    return this;
  }

   /**
   * nome do equipamento
   * @return nome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lacre", value = "nome do equipamento")

  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipamentoResponse equipamentoResponse = (EquipamentoResponse) o;
    return Objects.equals(this.id, equipamentoResponse.id) &&
        Objects.equals(this.marca, equipamentoResponse.marca) &&
        Objects.equals(this.modelo, equipamentoResponse.modelo) &&
        Objects.equals(this.nome, equipamentoResponse.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, marca, modelo, nome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipamentoResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
