/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.stiven.prueba.bean;

import com.stiven.prueba.dao.EmpleadoDAO;
import com.stiven.prueba.modelo.Empleados;
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
@Named(value = "empleadoBean")
@Dependent
public class empleadoBean {

   private List<Empleados> listaEmpleados;
    private Empleados empleado;

    public empleadoBean() {
        empleado = new Empleados();
    }

    public List<Empleados> getListaEmpleados() throws ClassNotFoundException, SQLException {
        listaEmpleados = new ArrayList();
        EmpleadoDAO dao = new EmpleadoDAO();
        listaEmpleados = dao.listar();
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }
    
    public void limpiarEmpleado(){
        this.empleado = new Empleados();
    }

    public void agregarEmpleado() throws ClassNotFoundException{
        EmpleadoDAO dao = new EmpleadoDAO();
        try {
            dao.guardar(this.empleado);
        } catch (SQLException ex) {
            Logger.getLogger(empleadoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarEmpleado() throws ClassNotFoundException{
        EmpleadoDAO dao = new EmpleadoDAO();
        try {
            dao.editar(this.empleado);
        } catch (SQLException ex) {
            Logger.getLogger(empleadoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarEmpleado() throws ClassNotFoundException {
        EmpleadoDAO dao = new EmpleadoDAO();
        try {
            dao.eliminar(this.empleado);
        } catch (SQLException ex) {
            Logger.getLogger(empleadoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
