/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.dal.DaoCurso;
import br.edu.qi.gestaohc.model.Curso;
import br.edu.qi.gestaohc.views.VwCursos;
import java.sql.SQLException;
import java.util.ArrayList;

/*Controlador para Curso.*/
public class ClCurso {

    protected Curso curso;
    protected DaoCurso mlCurso;
    protected VwCursos vwCurso;

    public ClCurso() {

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public DaoCurso getMlCurso() {
        return mlCurso;
    }

    public void setMlCurso(DaoCurso mlCurso) {
        this.mlCurso = mlCurso;
    }

    public VwCursos getVwCurso() {
        return vwCurso;
    }

    public void setVwCurso(VwCursos vwCurso) {
        this.vwCurso = vwCurso;
    }

    public void gravarCurso(Curso curso) throws SQLException {
        DaoCurso dc = new DaoCurso();
        dc.inserirCurso(curso);
    }

    public void editarCurso(Curso curso) {

    }

    public void deletarCurso(Integer id) {

    }

    public Curso mostrarCurso(Integer id) {
        return null;

    }

    public ArrayList listarTodosCursos() throws SQLException {
        DaoCurso dc = new DaoCurso();
        return dc.selecionarTodosCursos();
    }

    public ArrayList listarCursosAtributo(Curso curso) {
        return null;

    }

}
