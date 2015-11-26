package br.com.tharicki.projetofinal.models;

import javax.persistence.*;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nomefantasia;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;

    public Fornecedor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
