/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.models.MlAtividadeComplementar;
import br.edu.qi.gestaohc.objects.AtividadeComplementar;
import br.edu.qi.gestaohc.views.VwAtividadesComplementares;
import java.util.ArrayList;

/*Controlador para Atividade Complementar.*/
public class ClAtividadeComplementar {

    protected AtividadeComplementar ac;
    protected MlAtividadeComplementar mlAc;
    protected VwAtividadesComplementares vwAc;

    public ClAtividadeComplementar() {

    }

    public AtividadeComplementar getAc() {
        return ac;
    }

    public void setAc(AtividadeComplementar ac) {
        this.ac = ac;
    }

    public MlAtividadeComplementar getMlAc() {
        return mlAc;
    }

    public void setMlAc(MlAtividadeComplementar mlAc) {
        this.mlAc = mlAc;
    }

    public VwAtividadesComplementares getVwAc() {
        return vwAc;
    }

    public void setVwAc(VwAtividadesComplementares vwAc) {
        this.vwAc = vwAc;
    }

    public void gravarAtividadeComplementar(AtividadeComplementar ac) {

    }

    public void editarAtividadeComplementar(AtividadeComplementar ac) {

    }

    public void deletarAtividadeComplementar(Integer id) {

    }

    public AtividadeComplementar mostrarAtividadeComplementar(Integer id) {
        return null;

    }

    public ArrayList listarTodasAtividadesComplementares() {
        return null;

    }

    /**
     *   */
    public static ArrayList listarAtividadesComplementaresAtributo(AtividadeComplementar ac) {
        return null;

    }
}