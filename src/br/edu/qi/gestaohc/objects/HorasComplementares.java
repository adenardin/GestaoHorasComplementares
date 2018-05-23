/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.objects;

import java.util.Date;

/**
 *
 * @author anderson
 */
public class HorasComplementares {

    protected Aluno aluno;
    protected Curso curso;
    protected AtividadeComplementar ac;
    protected Date data;
    protected String descricao;
    protected Number hora_total;

    public HorasComplementares() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public AtividadeComplementar getAc() {
        return ac;
    }

    public void setAc(AtividadeComplementar ac) {
        this.ac = ac;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Number getHora_total() {
        return hora_total;
    }

    public void setHora_total(Number hora_total) {
        this.hora_total = hora_total;
    }

}
