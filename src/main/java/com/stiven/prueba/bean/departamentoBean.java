/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.stiven.prueba.bean;

import com.stiven.prueba.dao.DepartamentoDAO;
import com.stiven.prueba.modelo.Departamentos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author stive
 */
@Named(value = "departamentoBean")
@Dependent
public class departamentoBean {
    
    private List<Departamentos> listaDepartamentos;
    private Departamentos departamento;

    public departamentoBean() {
        departamento = new Departamentos();
    }

    public List<Departamentos> getListaDepartamentos() throws ClassNotFoundException, SQLException {
        listaDepartamentos = new ArrayList();
        DepartamentoDAO dao = new DepartamentoDAO();
        listaDepartamentos = dao.listar();
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamentos> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    
    public void limpiarDepartamento(){
        this.departamento = new Departamentos();
    }

    public void agregarDepartamento() throws ClassNotFoundException{
        DepartamentoDAO dao = new DepartamentoDAO();
        try {
            dao.guardar(this.departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamentoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarDepartamento() throws ClassNotFoundException{
        DepartamentoDAO dao = new DepartamentoDAO();
        try {
            dao.editar(this.departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamentoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarDepartamento() throws ClassNotFoundException {
        DepartamentoDAO dao = new DepartamentoDAO();
        try {
            dao.eliminar(this.departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamentoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
