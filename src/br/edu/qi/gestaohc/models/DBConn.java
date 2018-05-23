/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.gestaohc.models;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ALUNOS
 */
public class DBConn {
    
    DBConn dbconn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Connection conn = null;
    
    public static final String URL = "jdbc:mysql://localhost:3306/GestaoHC";
    public static final String USER = "root";
    public static final String PASS = "proc2008";
    /**
     * Get a connection to database
     * @return Connection object
    */
    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}