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
@Table(name = "CLIENTES")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ClientesTable")
    private String tipoDocumento;
    @Column(name = "documento", nullable = false, columnDefinition = "int default 100")
    private Integer documento;
    @Column(name = "primer_mombre", nullable = true, length = 150)
    private String primerNombre;
    @Column(name = "segundo_nombre", nullable = true, length = 150)
    private String segundoNombre;
    @Column(name = "primer_apellido", nullable = true, length = 150)
    private String primerApellido;
    @Column(name = "segundo_apellido", nullable = true, length = 150)
    private String segundoApellido;
    @Column(name = "celular", nullable = true, length = 150)
    private String celular;
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;
    @Column(name = "email", nullable = true, length = 150)
    private String email;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
    
    
}
