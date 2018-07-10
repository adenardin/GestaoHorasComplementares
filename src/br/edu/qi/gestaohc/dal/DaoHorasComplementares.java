/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.HorasComplementares;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/*Modelo para manipulação das "Horas Complementares"*/
public class DaoHorasComplementares extends DBConn{

    protected HorasComplementares hc;

    public DaoHorasComplementares() {

    }

    public HorasComplementares getHc() {
        return hc;
    }

    public void setHc(HorasComplementares hc) {
        this.hc = hc;
    }

    public void inserirHorasComplementares(HorasComplementares hc) throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.conn.setAutoCommit(false);
            this.pstmt = this.conn.prepareStatement(
                " INSERT INTO horas_complementares ("+
                " aluno_ra, "+
                " curso_id, "+
                " atividade_complementar_id, "+
                " data, "+
                " descricao, "+
                " total_horas) "+
                " VALUES ("+
                " ?, "+
                " ?, "+
                " ?, "+
                " ?, "+
                " ?, "+
                " ?)"
            );
            
            java.sql.Date d = new java.sql.Date (hc.getData().getTime());            
            
            this.pstmt.setInt(1, hc.getAluno().getRa());
            this.pstmt.setInt(2, hc.getCurso().getId());
            this.pstmt.setInt(3, hc.getAc().getId());
            this.pstmt.setDate(4, d);
            this.pstmt.setString(5, hc.getDescricao());
            this.pstmt.setInt(6, (int) hc.getHora_total());

            this.pstmt.execute();
            this.conn.commit();

        } catch (SQLException e) {
            this.conn.rollback();
            throw new SQLException(e.getMessage());
        } finally {
            this.conn.setAutoCommit(true);
            this.pstmt.close();
            this.conn.close();
        }
    }

    public void atualizarHorasComplementares(HorasComplementares hc) {

    }

    public void excluirHorasComplementares(Integer id) {

    }

    public HorasComplementares selecionarHorasComplementares(Integer id) {
        return null;

    }

    public ArrayList selecionarTodasHorasComplementares() throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM horas_complementares");
            this.pstmt.execute();
            
            this.rs = this.pstmt.executeQuery();
            ArrayList<HorasComplementares> listHorasComplementares = new ArrayList<HorasComplementares>();
            DaoCurso dc = new DaoCurso();         
            DaoAluno ac = new DaoAluno();         
            DaoAtividadeComplementar atComp = new DaoAtividadeComplementar();

            while (this.rs.next()) {
                HorasComplementares hc = new HorasComplementares();        
                hc.setAluno(ac.selecionarAluno(this.rs.getInt("aluno_ra")));
                hc.setCurso(dc.selecionarCurso(this.rs.getInt("curso_id")));                
                hc.setAc(atComp.selecionarAtividadeComplementar(this.rs.getInt("atividade_complementar_id")));
                hc.setData(this.rs.getDate("data"));
                hc.setDescricao(this.rs.getString("descricao"));
                hc.setHora_total(this.rs.getInt("total_horas"));
                listHorasComplementares.add(hc);
            }

            return listHorasComplementares;

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
    }

    public void selecionarHorasComplementaresAtributo(HorasComplementares hc) {

    }
}
