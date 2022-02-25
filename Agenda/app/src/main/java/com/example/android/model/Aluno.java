package com.example.android.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Integer id = 0;
    private String nome;
    private String telefone;
    private String email;

    public Aluno() { }

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public int getId() { return id; }

    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
    public void setId(int id) { this.id = id; }

    @NonNull
    @Override
    public String toString() { return nome; }
    public boolean temIdValido() { return id > 0; }
}
