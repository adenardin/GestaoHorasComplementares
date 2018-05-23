/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.models.MlAluno;
import br.edu.qi.gestaohc.objects.Aluno;
import br.edu.qi.gestaohc.views.VwAlunos;
import java.util.ArrayList;

/*Controlador para Aluno*/
public class ClAluno {

    protected Aluno aluno;
    protected MlAluno mlAluno;
    protected VwAlunos vwAluno;

    public ClAluno() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public MlAluno getMlAluno() {
        return mlAluno;
    }

    public void setMlAluno(MlAluno mlAluno) {
        this.mlAluno = mlAluno;
    }

    public VwAlunos getVwAluno() {
        return vwAluno;
    }

    public void setVwAluno(VwAlunos vwAluno) {
        this.vwAluno = vwAluno;
    }

    public void gravarAluno(Aluno aluno) {
        mlAluno = new MlAluno();
        mlAluno.inserirAluno(aluno);
    }

    public void editarAluno(Aluno aluno) {

    }

    public void deletarAluno(Integer ra) {

    }

    public Aluno mostrarAluno(Integer ra) {
        return null;

    }

    public ArrayList listarTodosAlunos() {
        return null;

    }

    public ArrayList listarAlunosAtributo(Aluno aluno) {
        return null;

    }
}
