/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car_center.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author aswtest
 */
@Entity
@Table(name = "REPUESTOS")
public class Repuestos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "RepuestosTable")
    private Integer codigo;
    @Column(name = "nombre_repuesto", nullable = true, length = 150)
    private String nombreRepuesto;
    @Column(name = "precio_unitario", nullable = true, scale = 2)
    private Double precioUnitario;
    @Column(name = "unidades_inventario", nullable = true, columnDefinition = "int default 100")
    private Integer unidadesInventario;
    @Column(name = "proveedor", nullable = true, length = 150)
    private String proveerdor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadesInventario() {
        return unidadesInventario;
    }

    public void setUnidadesInventario(Integer unidadesInventario) {
        this.unidadesInventario = unidadesInventario;
    }

    public String getProveerdor() {
        return proveerdor;
    }

    public void setProveerdor(String proveerdor) {
        this.proveerdor = proveerdor;
    }
    
    
    
}
