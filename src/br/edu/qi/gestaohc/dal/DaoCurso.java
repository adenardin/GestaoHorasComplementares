/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.Curso;
import java.util.ArrayList;

/*Modelo para manipular Curso.*/
public class DaoCurso {

    protected Curso curso;

    public DaoCurso() {

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void inserirCurso(Curso curso) {

    }

    public void atualizarCurso(Curso curso) {

    }

    public void excluirCurso(Integer id) {

    }

    public Curso selecionarCurso(Integer id) {
        return null;

    }

    public ArrayList selecionarTodosCursos() {
        return null;

    }

    public ArrayList selecionarCursosAtributo(Curso curso) {
        return null;

    }

}
