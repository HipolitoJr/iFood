package com.example.hipolito.myapplication.models;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Usuario {

    @Id public long id;
    private String nome;
    private String telefone;
    private String endereco;

}
