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
@Table(name = "SERVICIOS_X_MANTENIMIENTOS")
public class Servicios_x_Mantenimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Servicios_x_MantenimientosTable")
    private Integer codigo;
    @Column(name = "tiempo_estimado", nullable = true, columnDefinition = "int default 100")
    private Integer tiempoEstimado;
    @Column(name = "codigo_servicio", nullable = false, columnDefinition = "int default 100")
    private Integer codigoServicio;
    @Column(name = "codigo_mantenimiento", nullable = false, columnDefinition = "int default 100")
    private Integer codigoMantenimiento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public Integer getCodigoMantenimiento() {
        return codigoMantenimiento;
    }

    public void setCodigoMantenimiento(Integer codigoMantenimiento) {
        this.codigoMantenimiento = codigoMantenimiento;
    }
    
    
}
