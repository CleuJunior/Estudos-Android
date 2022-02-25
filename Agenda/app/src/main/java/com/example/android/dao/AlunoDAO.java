package com.example.android.dao;

import androidx.annotation.Nullable;

import com.example.android.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static Integer contadorDeIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        atualizaIds();
    }

    private void atualizaIds() { contadorDeIds++; }

    public void edita(Aluno aluno) {
        Aluno alunoEncontrado = buscaAlunoId(aluno);
        if (alunoEncontrado != null) {
            int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
            alunos.set(posicaoDoAluno, aluno);
        }
    }

    @Nullable
    private Aluno buscaAlunoId(Aluno aluno) {
        Aluno alunoEncontrado = null;
        for (Aluno a : alunos) {
            if (a.getId() == aluno.getId()) {
               return a;
            }
        }
        return null;
    }

    public List<Aluno> todos() { return new ArrayList<>(alunos); }

    public void remove(Aluno aluno) {
        Aluno alunoDevolvido = buscaAlunoId(aluno);
        if(alunoDevolvido != null) { alunos.remove(alunoDevolvido); }

    }
}
