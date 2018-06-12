/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.Funcionario;
import java.util.ArrayList;

/*(NULL)*/
public class DaoFuncionario {

    protected Funcionario funcionario;

    public DaoFuncionario() {

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void inserirFuncionario(Funcionario func) {

    }

    public void atualizarFuncionario(Funcionario func) {

    }

    public void excluirFuncionario(Integer id) {

    }

    public Funcionario selecionarFuncionario(Integer id) {
        return null;

    }

    public ArrayList selecionarTodosFuncionarios() {
        return null;

    }

    public ArrayList selecionarFuncionariosAtributo(Funcionario func) {
        return null;

    }
}
