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
public class Curso {

    protected Integer id;
    protected String nome;
    protected Date totalHoras;

    public Curso() {

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

    public Date getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(Date totalHoras) {
        this.totalHoras = totalHoras;
    }

}