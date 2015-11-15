package br.com.tharicki.projetofinal.models;

import javax.persistence.*;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String tempo_medio;
    @Column(nullable = false)
    private String preco_cobrado;
    @Column
    private String preco_custo;

    public Tarefa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo_medio() {
        return tempo_medio;
    }

    public void setTempo_medio(String tempo_medio) {
        this.tempo_medio = tempo_medio;
    }

    public String getPreco_cobrado() {
        return preco_cobrado;
    }

    public void setPreco_cobrado(String preco_cobrado) {
        this.preco_cobrado = preco_cobrado;
    }

    public String getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(String preco_custo) {
        this.preco_custo = preco_custo;
    }
}

