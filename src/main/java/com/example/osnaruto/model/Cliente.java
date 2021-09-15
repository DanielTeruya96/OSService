package com.example.osnaruto.model;

import javax.persistence.*;

@Entity
public class Cliente extends EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @Column(name = "razao_social", nullable = true, length = 255)
    private String razaoSocial;

    @Basic
    @Column(name = "cpf_pcpj", nullable = true, length = 255)
    private String cpfPcpj;

    @Basic
    @Column(name = "nome_fantasia", nullable = true, length = 255)
    private String nomeFantasia;

    @Basic
    @Column(name = "endereco", nullable = true, length = 500)
    private String endereco;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getCpfPcpj() {
        return cpfPcpj;
    }

    public void setCpfPcpj(String cpfPcpj) {
        this.cpfPcpj = cpfPcpj;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (id != null ? !id.equals(cliente.id) : cliente.id != null) return false;
        if (razaoSocial != null ? !razaoSocial.equals(cliente.razaoSocial) : cliente.razaoSocial != null) return false;
        if (cpfPcpj != null ? !cpfPcpj.equals(cliente.cpfPcpj) : cliente.cpfPcpj != null) return false;
        if (nomeFantasia != null ? !nomeFantasia.equals(cliente.nomeFantasia) : cliente.nomeFantasia != null)
            return false;
        if (endereco != null ? !endereco.equals(cliente.endereco) : cliente.endereco != null) return false;
        if (usuarioInclusao != null ? !usuarioInclusao.equals(cliente.usuarioInclusao) : cliente.usuarioInclusao != null)
            return false;
        if (usuarioAlteracao != null ? !usuarioAlteracao.equals(cliente.usuarioAlteracao) : cliente.usuarioAlteracao != null)
            return false;
        if (dataAlteracao != null ? !dataAlteracao.equals(cliente.dataAlteracao) : cliente.dataAlteracao != null)
            return false;
        if (versaoRegistro != null ? !versaoRegistro.equals(cliente.versaoRegistro) : cliente.versaoRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (razaoSocial != null ? razaoSocial.hashCode() : 0);
        result = 31 * result + (cpfPcpj != null ? cpfPcpj.hashCode() : 0);
        result = 31 * result + (nomeFantasia != null ? nomeFantasia.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (usuarioInclusao != null ? usuarioInclusao.hashCode() : 0);
        result = 31 * result + (usuarioAlteracao != null ? usuarioAlteracao.hashCode() : 0);
        result = 31 * result + (dataAlteracao != null ? dataAlteracao.hashCode() : 0);
        result = 31 * result + (versaoRegistro != null ? versaoRegistro.hashCode() : 0);
        return result;
    }
}
