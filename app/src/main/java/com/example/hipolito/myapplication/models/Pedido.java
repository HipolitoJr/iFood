package com.example.hipolito.myapplication.models;

import java.math.BigDecimal;
import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class Pedido {

    @Id public long id;
    private ToOne<Status> status;
    private double valorTotal;

    private ToMany<ItemPedido> produtos;
    private ToOne<Consumidor> consumidor;

}
