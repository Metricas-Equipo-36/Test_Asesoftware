/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car_center.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aswtest
 */
@Entity
@Table(name = "REPUESTOS_X_MANTENIMIENTOS")
public class Repuestos_x_Mantenimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Repuestos_x_MantenimientosTable")
    private Integer codigo;
    @Column(name = "unidades", nullable = true, columnDefinition = "int default 100")
    private Integer unidades;
    @Column(name = "tiempo_estimado", nullable = true, columnDefinition = "int default 100")
    private Integer tiempoEstimado;
    @Column(name = "codigo_mantenimiento", nullable = false, columnDefinition = "int default 100")
    private Integer codigoMantenimiento;
    @Column(name = "codigo_repuesto", nullable = false, columnDefinition = "int default 100")
    private Integer codigoRepuesto;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Integer getCodigoMantenimiento() {
        return codigoMantenimiento;
    }

    public void setCodigoMantenimiento(Integer codigoMantenimiento) {
        this.codigoMantenimiento = codigoMantenimiento;
    }

    public Integer getCodigoRepuesto() {
        return codigoRepuesto;
    }

    public void setCodigoRepuesto(Integer codigoRepuesto) {
        this.codigoRepuesto = codigoRepuesto;
    }
    
    
    
}
