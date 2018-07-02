/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.AtividadeComplementar;
import java.sql.SQLException;
import java.util.ArrayList;

/*Modelo de Manipulação dos Dados da Atividade Complementar*/
public class DaoAtividadeComplementar  extends DBConn{

    private AtividadeComplementar ac;

    public DaoAtividadeComplementar() {

    }

    public AtividadeComplementar getAc() {
        return ac;
    }

    public void setAc(AtividadeComplementar ac) {
        this.ac = ac;
    }

    public void inserirAtividadeComplementar(AtividadeComplementar ac)  throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.conn.setAutoCommit(false);
            this.pstmt = this.conn.prepareStatement("INSERT INTO atividade_complementar ("
                    + "nome, "
                    + "limite, "
                    + "curso_id "
                    + ") VALUES ( "
                    + "?, "
                    + "?, "                    
                    + "?)");

            this.pstmt.setString(1, ac.getNome());
            this.pstmt.setFloat(2, ac.getLimite().floatValue());
            this.pstmt.setInt(3, ac.getCurso().getId());

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

    public void atualizarAtividadeComplementar(AtividadeComplementar ac) {

    }

    public void excluirAtividadeComplementar(Integer id) {

    }

    public AtividadeComplementar selecionarAtividadeComplementar(Integer id) {
        return null;

    }

    public ArrayList selecionarTodasAtividadesComplementares() throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM atividade_complementar");
            this.pstmt.execute();
            
            this.rs = this.pstmt.executeQuery();
            ArrayList<AtividadeComplementar> listAtividadeComplementar = new ArrayList<AtividadeComplementar>();
            DaoCurso dc = new DaoCurso();            
            while (this.rs.next()) {
                AtividadeComplementar ac = new AtividadeComplementar();                                  
                ac.setId(this.rs.getInt("id"));
                ac.setNome(this.rs.getString("nome"));
                ac.setLimite(this.rs.getInt("limite"));
                ac.setCurso(dc.selecionarCurso(this.rs.getInt("curso_id")));
                listAtividadeComplementar.add(ac);
            }

            return listAtividadeComplementar;

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
    }

    public ArrayList selecionarAtividadesComplementaresAtributo(AtividadeComplementar ac) {
        return null;

    }

}
