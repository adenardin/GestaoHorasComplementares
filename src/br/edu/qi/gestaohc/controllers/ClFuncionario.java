/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.models.MlFuncionario;
import br.edu.qi.gestaohc.objects.Funcionario;
import br.edu.qi.gestaohc.views.VwFuncionarios;
import java.util.ArrayList;

/*Controlador para Funcionário.*/
public class ClFuncionario {

    protected Funcionario funcionario;
    protected MlFuncionario mlFuncionario;
    protected VwFuncionarios vwFuncionarios;

    public ClFuncionario() {

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public MlFuncionario getMlFuncionario() {
        return mlFuncionario;
    }

    public void setMlFuncionario(MlFuncionario mlFuncionario) {
        this.mlFuncionario = mlFuncionario;
    }

    public VwFuncionarios getVwFuncionarios() {
        return vwFuncionarios;
    }

    public void setVwFuncionarios(VwFuncionarios vwFuncionarios) {
        this.vwFuncionarios = vwFuncionarios;
    }

    public void gravarFuncionario(Funcionario func) {

    }

    public void editarFuncionario(Funcionario func) {

    }

    public void deletarFuncionario(Integer id) {

    }

    public Funcionario mostrarFuncionario(Integer id) {
        return null;

    }

    public ArrayList listarTodosFuncionarios() {
        return null;

    }

    public ArrayList listarFuncionariosAtributo(Funcionario func) {
        return null;

    }
}
