package com.example.hipolito.myapplication.models;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Status {

    @Id public long id;
    private String descricao;
}
