/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.models.MlCurso;
import br.edu.qi.gestaohc.objects.Curso;
import br.edu.qi.gestaohc.views.VwCursos;
import java.util.ArrayList;

/*Controlador para Curso.*/
public class ClCurso {

    protected Curso curso;
    protected MlCurso mlCurso;
    protected VwCursos vwCurso;

    public ClCurso() {

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public MlCurso getMlCurso() {
        return mlCurso;
    }

    public void setMlCurso(MlCurso mlCurso) {
        this.mlCurso = mlCurso;
    }

    public VwCursos getVwCurso() {
        return vwCurso;
    }

    public void setVwCurso(VwCursos vwCurso) {
        this.vwCurso = vwCurso;
    }

    public void gravarCurso(Curso curso) {

    }

    public void editarCurso(Curso curso) {

    }

    public void deletarCurso(Integer id) {

    }

    public Curso mostrarCurso(Integer id) {
        return null;

    }

    public ArrayList listarTodosCursos() {
        return null;

    }

    public ArrayList listarCursosAtributo(Curso curso) {
        return null;

    }

}
