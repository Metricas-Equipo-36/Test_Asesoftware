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
@Table(name = "SERVICIOS")
public class Servicios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ServiciosTable")
    private Integer codigo;
    @Column(name = "nombre_servicio", nullable = true, length = 150)
    private String nombreServicio;
    @Column(name = "precio", nullable = true, scale = 2)
    private double precio;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
