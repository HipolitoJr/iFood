package com.example.hipolito.myapplication.models;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Fornecedor extends Usuario{

    private String cnpj;
    private String nomeFantasia;
}
