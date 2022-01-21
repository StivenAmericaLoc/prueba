/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stiven.prueba.dao;

import com.stiven.prueba.modelo.Departamentos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stive
 */
public class DepartamentoDAO {

    public DepartamentoDAO() throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
    }   
    
    
    public void guardar(Departamentos departamento) throws SQLException{
        try (Connection conn = DriverManager.getConnection ("jdbc:h2:tcp://localhost/C:test", "sa","")) {
            Statement st = conn.createStatement();
            st.executeUpdate("");
        }
    }
    
    public void editar(Departamentos departamento) throws SQLException {
        try (Connection conn = DriverManager.getConnection ("jdbc:h2:tcp://localhost/C:test", "sa","")) {
            Statement st = conn.createStatement();
            st.executeUpdate("");
        } 
    }
    
    public void eliminar(Departamentos departamento) throws SQLException {
        try (Connection conn = DriverManager.getConnection ("jdbc:h2:tcp://localhost/C:test", "sa","")) {
            Statement st = conn.createStatement();
            st.executeUpdate("");
        } 
    }
    
    public List<Departamentos> listar() throws SQLException {
        try (Connection conn = DriverManager.getConnection ("jdbc:h2:tcp://localhost/C:test", "sa","")) {
            Statement st = conn.createStatement();
            st.executeUpdate("");
        } 
        return new ArrayList();
    }
    
}
