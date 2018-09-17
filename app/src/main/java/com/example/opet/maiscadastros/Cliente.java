package com.example.opet.maiscadastros;

import java.util.Date;

/**
 * Created by opet on 17/09/2018.
 */

public class Cliente {
    private int id;
    private Date nascimento;
    private String nome;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
