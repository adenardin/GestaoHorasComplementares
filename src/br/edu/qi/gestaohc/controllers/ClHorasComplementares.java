/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.controllers;

import br.edu.qi.gestaohc.models.MlHorasComplementares;
import br.edu.qi.gestaohc.objects.HorasComplementares;
import br.edu.qi.gestaohc.views.VwHorasComplementares;
import java.util.ArrayList;

/*Controlador para manipular Horas Complementares.*/
public class ClHorasComplementares {

    protected HorasComplementares hc;
    protected MlHorasComplementares mlHc;
    protected VwHorasComplementares vwHc;

    public ClHorasComplementares() {

    }

    public HorasComplementares getHc() {
        return hc;
    }

    public void setHc(HorasComplementares hc) {
        this.hc = hc;
    }

    public MlHorasComplementares getMlHc() {
        return mlHc;
    }

    public void setMlHc(MlHorasComplementares mlHc) {
        this.mlHc = mlHc;
    }

    public VwHorasComplementares getVwHc() {
        return vwHc;
    }

    public void setVwHc(VwHorasComplementares vwHc) {
        this.vwHc = vwHc;
    }

    public void gravarHorasComplementares(HorasComplementares hc) {

    }

    public void editarHorasComplementares(HorasComplementares hc) {

    }

    public void deletarHorasComplementares(Integer id) {

    }

    public HorasComplementares mostrarHorasComplementares(Integer id) {
        return null;

    }

    public ArrayList listarTodasHorasComplementares() {
        return null;

    }

    public ArrayList listarHorasComplementaresAtributo(HorasComplementares hc) {
        return null;

    }
}
