/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stiven.prueba.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stive
 */
@Entity
@Table(name = "DEPARTAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d"),
    @NamedQuery(name = "Departamentos.findById", query = "SELECT d FROM Departamentos d WHERE d.id = :id"),
    @NamedQuery(name = "Departamentos.findByDepartamentoCodigo", query = "SELECT d FROM Departamentos d WHERE d.departamentoCodigo = :departamentoCodigo"),
    @NamedQuery(name = "Departamentos.findByDepartamentoNombre", query = "SELECT d FROM Departamentos d WHERE d.departamentoNombre = :departamentoNombre"),
    @NamedQuery(name = "Departamentos.findByFechaHoraCrea", query = "SELECT d FROM Departamentos d WHERE d.fechaHoraCrea = :fechaHoraCrea"),
    @NamedQuery(name = "Departamentos.findByFechaHoraModifica", query = "SELECT d FROM Departamentos d WHERE d.fechaHoraModifica = :fechaHoraModifica")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEPARTAMENTO_CODIGO")
    private int departamentoCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DEPARTAMENTO_NOMBRE")
    private String departamentoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FECHA_HORA_CREA")
    private String fechaHoraCrea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FECHA_HORA_MODIFICA")
    private String fechaHoraModifica;

    public Departamentos() {
    }

    public Departamentos(Integer id) {
        this.id = id;
    }

    public Departamentos(Integer id, int departamentoCodigo, String departamentoNombre, String fechaHoraCrea, String fechaHoraModifica) {
        this.id = id;
        this.departamentoCodigo = departamentoCodigo;
        this.departamentoNombre = departamentoNombre;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    public void setDepartamentoCodigo(int departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

    public String getDepartamentoNombre() {
        return departamentoNombre;
    }

    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
    }

    public String getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(String fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public String getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(String fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stiven.prueba.modelo.Departamentos[ id=" + id + " ]";
    }
    
}
