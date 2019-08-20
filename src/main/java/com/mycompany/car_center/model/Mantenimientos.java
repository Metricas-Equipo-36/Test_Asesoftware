/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car_center.model;

import java.util.Date;
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
@Table(name = "MANTENIMIENTOS")
public class Mantenimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "MantenimientosTable")
    private Integer codigo;
    @Column(name = "estado", nullable = true, columnDefinition = "int default 100")
    private Integer estado;
    @Column(name = "cod_placa", nullable = false, length = 150)
    private String codPlaca;
    @Column(name = "fecha", nullable = true, length = 150)
    private Date fecha;
    @Column(name = "mec_documento", nullable = false, columnDefinition = "int default 100")
    private Integer mecDocumento;
    @Column(name = "mec_tipo_documento", nullable = false, length = 150)
    private String mecTipoDocumento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getCodPlaca() {
        return codPlaca;
    }

    public void setCodPlaca(String codPlaca) {
        this.codPlaca = codPlaca;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getMecDocumento() {
        return mecDocumento;
    }

    public void setMecDocumento(Integer mecDocumento) {
        this.mecDocumento = mecDocumento;
    }

    public String getMecTipoDocumento() {
        return mecTipoDocumento;
    }

    public void setMecTipoDocumento(String mecTipoDocumento) {
        this.mecTipoDocumento = mecTipoDocumento;
    }
    
    
    
            
    
}
