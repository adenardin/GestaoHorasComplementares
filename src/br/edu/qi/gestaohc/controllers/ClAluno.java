/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.dal.DaoAluno;
import br.edu.qi.gestaohc.model.Aluno;
import br.edu.qi.gestaohc.views.VwAlunos;
import java.sql.SQLException;
import java.util.ArrayList;

/*Controlador para Aluno*/
public class ClAluno {

    protected Aluno aluno;
    protected DaoAluno mlAluno;
    protected VwAlunos vwAluno;

    public ClAluno() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public DaoAluno getMlAluno() {
        return mlAluno;
    }

    public void setMlAluno(DaoAluno mlAluno) {
        this.mlAluno = mlAluno;
    }

    public VwAlunos getVwAluno() {
        return vwAluno;
    }

    public void setVwAluno(VwAlunos vwAluno) {
        this.vwAluno = vwAluno;
    }

    public void gravarAluno(Aluno aluno) throws SQLException {
        DaoAluno da = new DaoAluno();
        da.inserirAluno(aluno);
    }

    public void editarAluno(Aluno aluno) {

    }

    public void deletarAluno(Integer ra) {

    }

    public Aluno mostrarAluno(Integer ra) {
        return null;

    }

    public ArrayList listarTodosAlunos() throws SQLException {
        DaoAluno da = new DaoAluno();
        return da.selecionarTodosAlunos();
    }

    public ArrayList listarAlunosAtributo(Aluno aluno) {
        return null;

    }
}
