/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.Curso;
import java.sql.SQLException;
import java.util.ArrayList;

/*Modelo para manipular Curso.*/
public class DaoCurso extends DBConn{

    protected Curso curso;

    public DaoCurso() {

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void inserirCurso(Curso curso) throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.conn.setAutoCommit(false);
            this.pstmt = this.conn.prepareStatement("INSERT INTO curso ("
                    + "nome, "
                    + "total_horas "
                    + ") VALUES ( "
                    + "?, "
                    + "?)");

            this.pstmt.setString(1, curso.getNome());
            this.pstmt.setInt(2, curso.getTotalHoras());

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

    public void atualizarCurso(Curso curso) {

    }

    public void excluirCurso(Integer id) {

    }

    public Curso selecionarCurso(Integer id) throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM curso where id = " + id);
            this.pstmt.execute();            
            this.rs = this.pstmt.executeQuery();
            while (this.rs.next()) {
                Curso c = new Curso();                                  
                c.setId(this.rs.getInt("id"));
                c.setNome(this.rs.getString("nome"));
                c.setTotalHoras(this.rs.getInt("total_horas"));
                return c;                
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
        return null;
    }

    public ArrayList selecionarTodosCursos() throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM curso");
            this.pstmt.execute();
            
            this.rs = this.pstmt.executeQuery();

            ArrayList<Curso> listCurso = new ArrayList<Curso>();

            while (this.rs.next()) {
                Curso c = new Curso();                                  
                c.setId(this.rs.getInt("id"));
                c.setNome(this.rs.getString("nome"));
                c.setTotalHoras(this.rs.getInt("total_horas"));
                listCurso.add(c);
            }

            return listCurso;

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
    }

    public ArrayList selecionarCursosAtributo(Curso curso) {
        return null;

    }

}
