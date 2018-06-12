/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.model;

/**
 *
 * @author anderson
 */
public class AtividadeComplementar {

    protected Integer id;
    protected String nome;
    protected Number limite;
    protected Curso curso;

    public AtividadeComplementar() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getLimite() {
        return limite;
    }

    public void setLimite(Number limite) {
        this.limite = limite;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
