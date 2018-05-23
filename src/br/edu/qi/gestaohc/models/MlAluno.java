/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.models;

import br.edu.qi.gestaohc.objects.Aluno;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class MlAluno extends DBConn{

    protected Aluno aluno;

    public MlAluno() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void inserirAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }

    public void atualizarAluno(Aluno aluno) {

    }

    public void excluirAluno(Integer ra) {

    }

    public Aluno selecionarAluno(Integer ra) {
        return null;

    }

    public ArrayList selecionarTodosAlunos() {
        return null;

    }

    public ArrayList selecionarAlunosAtributo(Aluno aluno) {
        return null;

    }
}
