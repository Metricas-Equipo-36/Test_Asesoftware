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
@Table(name = "FOTOS")
public class Fotos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "FotosTable")
    private Integer codigo;
    @Column(name = "ruta", nullable = true, length = 150)
    private String ruta;
    @Column(name = "cod_mantenimiento", nullable = false, columnDefinition = "int default 100")
    private Integer codMantenimiento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getCodMantenimiento() {
        return codMantenimiento;
    }

    public void setCodMantenimiento(Integer codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }
    
    
    
}
