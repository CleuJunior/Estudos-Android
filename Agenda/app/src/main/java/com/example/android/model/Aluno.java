package com.example.android.model;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;


    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Email: " + email + '\n' +
                "Telefone: " + telefone;

    }

}
