/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.dal;

import br.edu.qi.gestaohc.model.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class DaoAluno extends DBConn {

    private Aluno aluno;

    public DaoAluno() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void inserirAluno(Aluno aluno) throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.conn.setAutoCommit(false);
            this.pstmt = this.conn.prepareStatement("INSERT INTO aluno ("
                    + "nome, "
                    + "email ,"
                    + "telefone_cel, "
                    + "telefone_outro, "
                    + "login, "
                    + "senha "
                    + ") VALUES ( "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?)");

            this.pstmt.setString(1, aluno.getNome());
            this.pstmt.setString(2, aluno.getEmail());
            this.pstmt.setString(3, aluno.getTelefone_cel());
            this.pstmt.setString(4, aluno.getTelefone_outro());
            this.pstmt.setString(5, aluno.getLogin());
            this.pstmt.setString(6, aluno.getSenha());

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

    public void atualizarAluno(Aluno aluno) {

    }

    public void excluirAluno(Integer ra) {

    }

    public Aluno selecionarAluno(Integer ra) throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM aluno where ra = " + ra);
            this.pstmt.execute();            
            this.rs = this.pstmt.executeQuery();
            while (this.rs.next()) {
                Aluno a = new Aluno();                                  
                a.setRa(this.rs.getInt("ra"));
                a.setNome(this.rs.getString("nome"));
                return a;                
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
        return null;
    }

    public ArrayList selecionarTodosAlunos() throws SQLException {
        try {            
            this.conn = DBConn.getConnection();
            this.pstmt = this.conn.prepareStatement("SELECT * FROM aluno");
            this.pstmt.execute();
            
            this.rs = this.pstmt.executeQuery();

            ArrayList<Aluno> listAluno = new ArrayList<Aluno>();

            while (this.rs.next()) {
                Aluno a = new Aluno();                                  
                a.setRa(this.rs.getInt("ra"));
                a.setNome(this.rs.getString("nome"));
                a.setEmail(this.rs.getString("email"));
                a.setTelefone_cel(this.rs.getString("telefone_cel"));
                a.setTelefone_outro(this.rs.getString("telefone_outro"));
                a.setLogin(this.rs.getString("login"));

                listAluno.add(a);
            }

            return listAluno;

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            this.pstmt.close();
            this.conn.close();
        }
    }

    public ArrayList selecionarAlunosAtributo(Aluno aluno) {
        return null;

    }
}
