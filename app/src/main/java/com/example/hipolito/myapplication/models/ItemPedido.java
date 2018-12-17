package com.example.hipolito.myapplication.models;

import java.math.BigDecimal;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class ItemPedido {

    @Id public long id;
    private int quantidade;
    private double valorTotalItem;

    private ToOne<Produto> produto;
    private ToOne<Pedido> pedido;
}
