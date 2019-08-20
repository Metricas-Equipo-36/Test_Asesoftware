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
@Table(name = "VEHICULOS")
public class Vehiculos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "VehiculosTable")
    private String placa;
    @Column(name = "color", nullable = true, length = 150)
    private String color;
    @Column(name = "cod_marca", nullable = false, columnDefinition = "int default 100")
    private Integer codMarca;
    @Column(name = "cli_documento", nullable = false, columnDefinition = "int default 100")
    private Integer cliDocumento;
    @Column(name = "cli_tipo_documento", nullable = false, length = 150)
    private String cliTipoDocumento;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Integer codMarca) {
        this.codMarca = codMarca;
    }

    public Integer getCliDocumento() {
        return cliDocumento;
    }

    public void setCliDocumento(Integer cliDocumento) {
        this.cliDocumento = cliDocumento;
    }

    public String getCliTipoDocumento() {
        return cliTipoDocumento;
    }

    public void setCliTipoDocumento(String cliTipoDocumento) {
        this.cliTipoDocumento = cliTipoDocumento;
    }
    
            
    
}
