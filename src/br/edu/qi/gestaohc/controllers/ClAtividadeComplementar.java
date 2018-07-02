/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.dal.DaoAtividadeComplementar;
import br.edu.qi.gestaohc.model.AtividadeComplementar;
import br.edu.qi.gestaohc.views.VwAtividadesComplementares;
import java.sql.SQLException;
import java.util.ArrayList;

/*Controlador para Atividade Complementar.*/
public class ClAtividadeComplementar {

    protected AtividadeComplementar ac;
    protected DaoAtividadeComplementar mlAc;
    protected VwAtividadesComplementares vwAc;

    public ClAtividadeComplementar() {

    }

    public AtividadeComplementar getAc() {
        return ac;
    }

    public void setAc(AtividadeComplementar ac) {
        this.ac = ac;
    }

    public DaoAtividadeComplementar getMlAc() {
        return mlAc;
    }

    public void setMlAc(DaoAtividadeComplementar mlAc) {
        this.mlAc = mlAc;
    }

    public VwAtividadesComplementares getVwAc() {
        return vwAc;
    }

    public void setVwAc(VwAtividadesComplementares vwAc) {
        this.vwAc = vwAc;
    }

    public void gravarAtividadeComplementar(AtividadeComplementar ac) throws SQLException {
        DaoAtividadeComplementar dac = new DaoAtividadeComplementar();
        dac.inserirAtividadeComplementar(ac);
    }

    public void editarAtividadeComplementar(AtividadeComplementar ac) {

    }

    public void deletarAtividadeComplementar(Integer id) {

    }

    public AtividadeComplementar mostrarAtividadeComplementar(Integer id) {
        return null;

    }

    public ArrayList listarTodasAtividadesComplementares() throws SQLException {
        DaoAtividadeComplementar dac = new DaoAtividadeComplementar();
        return dac.selecionarTodasAtividadesComplementares();
    }

    /**
     *   */
    public static ArrayList listarAtividadesComplementaresAtributo(AtividadeComplementar ac) {
        return null;

    }
}
