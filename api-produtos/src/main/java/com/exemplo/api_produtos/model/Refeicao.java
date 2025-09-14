package com.exemplo.api_produtos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "refeicao")
public class Refeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_alimento")
    private Long idAlimento;

    private String horario;
    private Integer quantidade;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdAlimento() { return idAlimento; }
    public void setIdAlimento(Long idAlimento) { this.idAlimento = idAlimento; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}

