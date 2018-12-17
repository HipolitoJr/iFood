package com.example.hipolito.myapplication.models;

import java.math.BigDecimal;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Produto {

    @Id public long id;
    private String descricao;
    private double valor;
    private String informacao;

    private ToOne<Fornecedor> fornecedor;
}
