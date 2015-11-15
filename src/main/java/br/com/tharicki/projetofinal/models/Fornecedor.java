package br.com.tharicki.projetofinal.models;

import javax.persistence.*;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getNome_fantasia() {
        return nomefantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nomefantasia = nome_fantasia;
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
