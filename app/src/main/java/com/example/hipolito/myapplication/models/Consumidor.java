package com.example.hipolito.myapplication.models;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Consumidor extends Usuario{

    private String cpf;
    private String email;
}
